package com.test.michael.business;

import com.test.michael.business.draw.domain.valobj.AwardItem;
import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;
import com.test.michael.business.draw.service.DrawLotteryService;
import com.test.michael.business.facade.Request;
import com.test.michael.business.facade.Response;
import com.test.michael.business.prize.service.LotteryPrizeService;
import com.test.michael.business.qualification.service.LotteryQualifyService;
import com.test.michael.business.risk.service.LotteryRiskService;

/**
 * @author harry
 */
public class DrawLotteryAppService {

    private LotteryRiskService lotteryRiskService; //风控上下文
    private LotteryQualifyService lotteryQualifyService;  //抽奖资格上下文
    private DrawLotteryService drawLotteryService;  //抽奖核心上下文
    private LotteryPrizeService lotteryPrizeService; //奖品发放上下文


    public Response doDrawLottery(Request request){
        Response response=new Response();
        validate(request);

        DrawLotteryContext context=buildContext(request);

        //校验风控规则
        lotteryRiskService.accquireAccess(context);

        //校验抽奖资格
        lotteryQualifyService.checkLotteryCondition(context);

        //抽奖
        AwardItem awardItem=drawLotteryService.drawLottery(context);

        //发放奖品
        lotteryPrizeService.sendAwardPrize(awardItem,context);

        return response;

    }

    private DrawLotteryContext buildContext(Request request){
        DrawLotteryContext context=new DrawLotteryContext();
        //TODO, request转化为context值对象
        return context;
    }

    private void validate(Request request){
        //TODO
    }

}
