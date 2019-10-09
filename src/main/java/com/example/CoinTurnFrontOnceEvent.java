package com.example;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:39
 */
public class CoinTurnFrontOnceEvent extends AbstractPossibilityEvent {

    public CoinTurnFrontOnceEvent(double possibility) {
        super(possibility);
    }

    @Override
    public double getPossibility() {
        return this.possibility;
    }
}
