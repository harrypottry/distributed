package com.test.michael.business.draw.service;

import com.test.michael.business.draw.domain.valobj.AwardItem;
import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;

/**
 * @author harry
 */
public interface DrawLotteryService {

    AwardItem drawLottery(DrawLotteryContext context);
}
