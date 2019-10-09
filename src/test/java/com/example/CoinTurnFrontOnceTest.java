package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:53
 */
public class CoinTurnFrontOnceTest {

    @Test
    public void should_get_0点5_when_possibility_0点5_and_turn_once() {
        //given
        double possibility = 0.5;
        CoinTurnFrontOnceEvent onceEvent = new CoinTurnFrontOnceEvent(possibility);

        //when
        double possibilityForOnce = onceEvent.getPossibility();

        //then
        Assert.assertEquals(possibilityForOnce, 0.5, 0);
    }

    @Test
    public void should_get_0点25_when_possibility_0点5_and_turn_twice() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent onceEvent = new CoinTurnFrontOnceEvent(possibility);

        //when
        double possibilityForTwice = onceEvent.and(onceEvent).getPossibility();

        //then
        Assert.assertEquals(possibilityForTwice, 0.25, 0);
    }
}
