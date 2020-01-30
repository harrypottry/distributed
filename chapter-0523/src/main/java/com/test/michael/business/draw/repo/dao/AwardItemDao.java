package com.test.michael.business.draw.repo.dao;

import com.test.michael.business.draw.repo.dao.pojo.AwardItemPO;
import com.test.michael.business.draw.repo.dao.pojo.AwardPoolPO;

import java.util.List;

/**
 * @author harry
 */
public interface AwardItemDao {

    List<AwardItemPO> getAwardItemByAwardPoolId(int awardPoolId);
}
