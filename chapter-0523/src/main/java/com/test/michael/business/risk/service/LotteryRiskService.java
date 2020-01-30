package com.test.michael.business.risk.service;

import com.test.michael.business.draw.domain.valobj.DrawLotteryContext;

/**
 * @author harry
 */
public interface LotteryRiskService {

    /**
     * 风控校验
     */
    boolean accquireAccess(DrawLotteryContext context);

}
