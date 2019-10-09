package com.example;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:31
 */
abstract class AbstractPossibilityEvent {
    protected double possibility;
    protected double finalPossibilityForHappen;
    protected double finalPossibilityForNotHappen;

    AbstractPossibilityEvent(double possibility) {
        this.possibility = possibility;
        this.finalPossibilityForHappen = this.possibility;
        this.finalPossibilityForNotHappen = 1 - this.possibility;
    }

    AbstractPossibilityEvent and(AbstractPossibilityEvent event) {
        this.finalPossibilityForHappen = this.finalPossibilityForHappen * event.possibility;
        return this;
    }

    AbstractPossibilityEvent or(AbstractPossibilityEvent event) {
        this.finalPossibilityForHappen = this.finalPossibilityForHappen + event.possibility -
                this.finalPossibilityForHappen * event.possibility;
        return this;
    }

    AbstractPossibilityEvent not(AbstractPossibilityEvent event) {
        this.finalPossibilityForNotHappen = this.finalPossibilityForNotHappen * (1 - event.possibility);
        return this;
    }

    abstract double getFinalPossibilityForHappen();

    abstract double getFinalPossibilityForNotHappen();
}
