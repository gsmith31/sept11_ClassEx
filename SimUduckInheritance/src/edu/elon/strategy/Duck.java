/*
 * Duck.java version 1.0 Sep 4, 2014
 *
 * Copyright (c) 2014 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public abstract class Duck {

  public Duck() {
    // intentionally empty
  }

  public abstract String display();

  public String fly() {
    String result = "I can fly";
    System.out.println(result);
    return result;
  }

  public String quack() {
    String result = "Quack, Quack";
    System.out.println(result);
    return result;
  }

  public String swim() {
    String result = "I can swim";
    System.out.println(result);
    return result;
  }

}
