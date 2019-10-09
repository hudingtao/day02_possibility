package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:53
 */
public class CoinTurnFrontEventTest {

    @Test
    public void should_get_0点5_when_possibility_0点5_and_turn_once() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent onceEvent = new CoinTurnFrontEvent(possibility);

        //when
        double possibilityForOnce = onceEvent.getFinalPossibilityForHappen();

        //then
        Assert.assertEquals(0.5, possibilityForOnce, 0);
    }

    @Test
    public void should_get_0点25_when_possibility_0点5_and_turn_twice() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent onceEvent = new CoinTurnFrontEvent(possibility);

        //when
        double possibilityForTwice = onceEvent.and(onceEvent).getFinalPossibilityForHappen();

        //then
        Assert.assertEquals(0.25, possibilityForTwice , 0);
    }

    @Test
    public void should_get_0点125_when_possibility_0点5_and_turn_third() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent onceEvent = new CoinTurnFrontEvent(possibility);

        //when
        double possibilityForTwice = onceEvent.and(onceEvent).and(onceEvent).getFinalPossibilityForHappen();

        //then
        Assert.assertEquals(0.125, possibilityForTwice, 0);
    }
}
