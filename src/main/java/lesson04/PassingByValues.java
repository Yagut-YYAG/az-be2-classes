package lesson04;

public class PassingByValues {

  // passing by values
  public static void main(String[] args) {
    int i = 5;
    int k = 7;
    System.out.println("before");
    System.out.printf("i=%d\n", i);
    System.out.printf("k=%d\n", k);
    swap(i, k);
    System.out.println("after");
    System.out.printf("i=%d\n", i);
    System.out.printf("k=%d\n", k);
  }

  private static void swap(int one, int two) {
    int tmp = one;
    one = two;
    two = tmp;
  }
}
