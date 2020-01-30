package com.test.michael.business.draw.repo.dao;

import com.test.michael.business.draw.repo.dao.pojo.AwardPoolPO;

import java.util.List;

/**
 * @author harry
 */
public interface AwardPoolDao {

    /**
     * 根据lotteryId批次号获取奖品池
     * @param lotteryId
     * @return
     */
    List<AwardPoolPO> getAwardPoolByLotteryId(int lotteryId);
}
