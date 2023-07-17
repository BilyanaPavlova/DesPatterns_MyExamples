package org.StrategyPattern;

public class FlyLow implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly low");
    }
}
