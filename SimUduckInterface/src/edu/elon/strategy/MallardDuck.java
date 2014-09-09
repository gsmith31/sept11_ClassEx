/*
 * MallardDuck.java version 1.0 Sep 4, 2014
 *
 * Copyright (c) 2014 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public class MallardDuck extends Duck implements Quackable, Flyable {

  public MallardDuck() {
    super();
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

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.strategy.Flyable#fly()
   */
  @Override
  public String fly() {
    String result = "I can fly";
    System.out.println(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.elon.strategy.Quackable#quack()
   */
  @Override
  public String quack() {
    String result = "Quack, Quack";
    System.out.println(result);
    return result;
  }

}
