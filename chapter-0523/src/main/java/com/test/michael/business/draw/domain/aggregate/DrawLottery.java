package com.test.michael.business.draw.domain.aggregate;

import com.test.michael.business.draw.domain.valobj.AwardPool;
import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;

import java.util.List;

/**
 * @author harry
 */
public class DrawLottery {

    private int lotteryId; //抽奖id,用于区分奖品批次

    private List<AwardPool> awardPools; //奖池列表


    public AwardPool chooseAwardPool(DrawLotteryContext context){
        return chooseAwardByUserType(awardPools,context.getUserType());
    }

    //根据用户类型选择不同的奖池
    private AwardPool chooseAwardByUserType(List<AwardPool> awardPools,int userType){
        for(AwardPool awardPool:awardPools){
            if(awardPool.matchUserType(userType)){
                return awardPool;
            }
        }
        return null;
    }

    public int getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(int lotteryId) {
        this.lotteryId = lotteryId;
    }

    public List<AwardPool> getAwardPools() {
        return awardPools;
    }

    public void setAwardPools(List<AwardPool> awardPools) {
        this.awardPools = awardPools;
    }
}
