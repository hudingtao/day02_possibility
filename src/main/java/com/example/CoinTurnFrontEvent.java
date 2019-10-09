package com.example;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:39
 */
public class CoinTurnFrontEvent extends AbstractPossibilityEvent {

    public CoinTurnFrontEvent(double possibility) {
        super(possibility);
    }

    @Override
    public double getFinalPossibilityForHappen() {
        return this.finalPossibilityForHappen;
    }

    @Override
    double getFinalPossibilityForNotHappen() {
        return this.finalPossibilityForNotHappen;
    }
}
