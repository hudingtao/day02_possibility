package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:53
 */
public class PickRedBallEventTest {

    @Test
    public void should_get_0点75_when_possibility_0点5_and_pick_at_least_once_for_two_chance() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent pickRedBallEvent = new PickRedBallEvent(possibility);

        //when
        double possibilityForPickAtLeastOnce = pickRedBallEvent.or(pickRedBallEvent).getFinalPossibilityForHappen();

        //then
        Assert.assertEquals(0.75, possibilityForPickAtLeastOnce , 0);
    }

    @Test
    public void should_get_0点875_when_possibility_0点5_and_pick_at_least_once_for_three_chance() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent pickRedBallEvent = new PickRedBallEvent(possibility);

        //when
        double possibilityForPickAtLeastOnce = pickRedBallEvent.or(pickRedBallEvent)
                .or(pickRedBallEvent).getFinalPossibilityForHappen();

        //then
        Assert.assertEquals(0.875, possibilityForPickAtLeastOnce, 0);
    }

    @Test
    public void should_get_0点25_when_possibility_0点5_and_pick_none_for_two_chance() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent pickRedBallEvent = new PickRedBallEvent(possibility);

        //when
        double possibilityForPickNone = pickRedBallEvent.not(pickRedBallEvent).getFinalPossibilityForNotHappen();

        //then
        Assert.assertEquals(0.25, possibilityForPickNone, 0);
    }

    @Test
    public void should_get_0点125_when_possibility_0点5_and_pick_none_for_three_chance() {
        //given
        double possibility = 0.5;
        AbstractPossibilityEvent pickRedBallEvent = new PickRedBallEvent(possibility);

        //when
        double possibilityForPickNone = pickRedBallEvent.not(pickRedBallEvent)
                .not(pickRedBallEvent).getFinalPossibilityForNotHappen();

        //then
        Assert.assertEquals(0.125, possibilityForPickNone, 0);
    }
}
