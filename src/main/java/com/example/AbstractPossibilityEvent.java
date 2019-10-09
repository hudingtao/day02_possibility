package com.example;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/27 23:31
 */
abstract class AbstractPossibilityEvent {
    double possibility;

    AbstractPossibilityEvent(double possibility) {
        this.possibility = possibility;
    }

    AbstractPossibilityEvent and(AbstractPossibilityEvent event) {
        this.possibility = this.getPossibility() * event.getPossibility();
        return this;
    }

    abstract double getPossibility();
}
