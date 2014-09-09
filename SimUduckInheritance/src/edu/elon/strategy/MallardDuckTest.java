package edu.elon.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MallardDuckTest {
  private MallardDuck duck;

  @Before
  public void setUp() throws Exception {
    duck = new MallardDuck();
  }

  @After
  public void tearDown() throws Exception {
    duck = null;
  }

  @Test
  public void testDisplay() {
    String expected = "I'm a real Mallard Duck";
    String actual = duck.display();
    assertEquals(expected, actual);
  }

  @Test
  public void testFly() {
    String expected = "I can fly";
    String actual = duck.fly();
    assertEquals(expected, actual);
  }

  @Test
  public void testQuack() {
    String expected = "Quack, Quack";
    String actual = duck.quack();
    assertEquals(expected, actual);
  }

  @Test
  public void testSwim() {
    String expected = "I can swim";
    String actual = duck.swim();
    assertEquals(expected, actual);
  }

}
