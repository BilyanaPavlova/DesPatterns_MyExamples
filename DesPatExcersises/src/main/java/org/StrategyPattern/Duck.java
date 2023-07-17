package org.StrategyPattern;

public class Duck {

    private IQuackBahavior qb;
    private IFlyBehavior fb;
    private IRunBehavior rb;

    public Duck (IQuackBahavior qb,
                 IFlyBehavior fb,
                 IRunBehavior rb){
        this.qb = qb;
        this.fb = fb;
        this.rb = rb;
    }

    public void quack(){
        this.qb.quack();
    }
    public void run(){
        this.rb.run();
    }
    public void fly(){
        this.fb.fly();
    }
}
