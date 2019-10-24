package lesson04;

public class PassingByReference {
  public static void main(String[] args) {
    final IntContainer ic = new IntContainer(5);
    final IntContainer kc = new IntContainer(7);
    System.out.println("before");
    System.out.printf("i=%d\n", ic.value);
    System.out.printf("k=%d\n", kc.value);
    swap(ic, kc);
    System.out.println("after");
    System.out.printf("i=%d\n", ic.value);
    System.out.printf("k=%d\n", kc.value);
  }

  private static void swap(final IntContainer one, final IntContainer two) {
    int tmp = one.value;
    one.value = two.value;
    two.value = tmp;
  }
}
