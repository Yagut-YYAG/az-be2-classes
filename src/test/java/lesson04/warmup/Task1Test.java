package lesson04.warmup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

  Task1 t;

  public boolean isCharValid(char c) {
    return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
  }

  public boolean isCharInvalid(char c) {
    return (c < 'A') || (c > 'Z' && c< 'a') || (c > 'z');
  }

  @Before // before each method (test)
  public void before999() {
    this.t = new Task1();
  }

  @After
  public void after888() {
    //this.t = null;
  }

  @Test
  public void gen_random1() {
    String generated = t.gen_random(10);
    assertEquals(10, generated.length());
  }

  @Test
  public void gen_random2() {
    String generated = t.gen_random(10);
    char charAt0 = generated.charAt(0);
    assertTrue(isCharValid(charAt0));
  }

  @Test
  public void gen_random3() {
    String generated = t.gen_random(10);
    for (int i = 0; i < generated.length(); i++) {
      char c = generated.charAt(i);
      assertTrue(isCharValid(c));
    }
  }

  @Test
  public void gen_random4() {
    String generated = t.gen_random(10);
    for (int i = 0; i < generated.length(); i++) {
      char c = generated.charAt(i);
      boolean charInvalid = isCharInvalid(c);
      assertFalse(charInvalid);
    }
  }
}
