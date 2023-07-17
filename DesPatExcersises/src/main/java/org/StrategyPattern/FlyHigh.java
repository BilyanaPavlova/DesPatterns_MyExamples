package org.StrategyPattern;

public class FlyHigh implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
