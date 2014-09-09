/**
 * Getenv.java 1.0 Sep 4, 2014
 *
 * Copyright (c) 2014 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.test;

import java.util.StringTokenizer;

/**
 * demo of how System.getenv works
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class Getenv {

  /**
   * main application to demonstrate getting value of a well known
   * environment variable, CLASSPATH.
   * 
   * @param args String [] of command line parameters.
   */
  public static void main(String[] args) {
    String path = "";
    StringTokenizer st;
    try {
      path = System.getenv("CLASSPATH");
      System.out.println("CLASSPATH is:");
      st = new StringTokenizer(path, ";");
      while (st.hasMoreTokens()) {
        System.out.println("\t" + st.nextToken());
      }
    } catch (NullPointerException e) {
      System.out.println("Environmental Variable, CLASSPATH, not defined.");
      e.printStackTrace();
    }
    System.exit(0);
  }
}
