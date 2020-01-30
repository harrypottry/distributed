package com.test.michael.business.draw.domain.valobj;

/**
 * @author harry
 */
public class DrawLotteryContext {

    private int userType;

    private int lotteryId;

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(int lotteryId) {
        this.lotteryId = lotteryId;
    }
}
