package org.StrategyPattern;

public class DuckDemo {


    public static void main(String[] args) {
        Duck duck;
        duck = new Duck(new QuackLoud(), new FlyLow(), new RunFast());
        duck.quack();
        duck.run();
        duck.fly();

        duck = new Duck(new QuackQuiet(), new FlyHigh(), new RunFast());
        duck.quack();
        duck.run();
        duck.fly();
    }
}
