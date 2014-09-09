/*
 * MallardDuck.java version 1.0 Sep 4, 2014
 *
 * Copyright (c) 2014 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public class MallardDuck extends Duck {

  public MallardDuck() {
    super();
    setFlyBehavior(new FlyWithWings());
    setQuackBehavior(new Quack());
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.strategy.Duck#display()
   */
  @Override
  public String display() {
    String result = "I'm a real Mallard Duck";
    System.out.println(result);
    return result;
  }

}
