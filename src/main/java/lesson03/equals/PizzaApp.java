package lesson03.equals;

public class PizzaApp {
  public static void main(String[] args) {
    Pizza p1 = new Pizza(30);
    Pizza p2 = new Pizza(30);
//    System.out.println(p1.getSize());
//    System.out.println(p2.getSize());
//    p2.setSize(55);
//    System.out.println(p1.getSize());
//    System.out.println(p2.getSize());

    if (p1 == p2) {
      System.out.println("They are identical");
    } else {
      System.out.println("They aren't identical");
    }
    if (p1.equals(p2)) {
      System.out.println("They are identical");
    } else {
      System.out.println("They aren't identical");
    }


  }
}
