package com.test.michael.business.draw.domain.valobj;

/**
 * @author harry
 */
public class AwardItem {

    private int probability;       //概率
    private int totalNum;          //数量
    private AwardPrize awardPrize; //奖品


    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public AwardPrize getAwardPrize() {
        return awardPrize;
    }

    public void setAwardPrize(AwardPrize awardPrize) {
        this.awardPrize = awardPrize;
    }
}
