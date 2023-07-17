package org.StrategyPattern;

public class QuackQuiet implements IQuackBahavior{

    private IQuackBahavior qb;


    public void quack(){
        System.out.println("quacking quiet");
    }
}
