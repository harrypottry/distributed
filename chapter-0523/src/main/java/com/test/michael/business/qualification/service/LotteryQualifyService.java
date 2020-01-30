package com.test.michael.business.qualification.service;

import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;

/**
 * @author harry
 */
public interface LotteryQualifyService {

    /**
     * 资格判断
     * @param context
     * @return
     */
    boolean checkLotteryCondition(DrawLotteryContext context);
}
