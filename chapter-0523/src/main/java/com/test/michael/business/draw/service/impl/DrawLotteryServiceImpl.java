package com.test.michael.business.draw.service.impl;

import com.test.michael.business.draw.domain.aggregate.DrawLottery;
import com.test.michael.business.draw.domain.valobj.AwardItem;
import com.test.michael.business.draw.domain.valobj.AwardPool;
import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;
import com.test.michael.business.draw.repo.repository.DrawLotteryRepository;
import com.test.michael.business.draw.service.DrawLotteryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author harry
 */
public class DrawLotteryServiceImpl implements DrawLotteryService {

    //资源库
    @Autowired
    DrawLotteryRepository drawLotteryRepository;

    @Override
    public AwardItem drawLottery(DrawLotteryContext context) {
        DrawLottery drawLottery=drawLotteryRepository.getDrawLotteryById(context.getLotteryId());
        AwardPool awardPool=drawLottery.chooseAwardPool(context);
        return awardPool.doDraw();
    }
}
