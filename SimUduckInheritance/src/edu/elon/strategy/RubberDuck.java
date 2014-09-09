/*
 * RubberDuck.java version 1.0 Sep 4, 2014
 *
 * Copyright (c) 2014 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super();
  }

  @Override
  public String display() {
    String result = "I'm a Rubber Duck";
    System.out.println(result);
    return result;
  }

  @Override
  public String fly() {
    String result = "I can't fly";
    System.out.println(result);
    return result;
  }

  @Override
  public String quack() {
    String result = "Squeak, Squeak";
    System.out.println(result);
    return result;
  }

}
