package com.test.michael.business.prize.service;

import com.test.michael.business.draw.domain.valobj.AwardItem;
import com.test.michael.business.draw.domain.valobj.AwardPrize;
import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;

/**
 * @author harry
 */
public interface LotteryPrizeService {

    /**
     * 发放奖品
     * @param awardItem
     * @param context
     * @return
     */
    AwardPrize sendAwardPrize(AwardItem awardItem, DrawLotteryContext context);
}
