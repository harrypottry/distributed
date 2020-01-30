package com.test.michael.business.draw.repo.repository.cache;

import com.test.michael.business.draw.domain.aggregate.DrawLottery;

/**
 * @author harry
 * 提供缓存访问服务
 */
public class DrawLotteryCacheAccess {

    //伪代码
    public DrawLottery get(int lotteryId){
        //TODO 从缓存中获取
        return null;
    }

    public void set(int lotteryId,DrawLottery drawLottery){
        //TODO 存储到缓存中
    }
}
