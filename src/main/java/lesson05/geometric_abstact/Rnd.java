package lesson05.geometric_abstact;

public class Rnd {

  static int value(int range) {
    return (int) (Math.random()*range+1);
  }

  static int value() {
    return value(10);
  }

}
