package org.StrategyPattern;

public class RunSlow implements IRunBehavior{

    @Override
    public void run() {
        System.out.println("run slow");
    }
}
