package lesson02.warmup;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomMirror {
  public static void main(String[] args) {
    int min = -5;
    int max = 5;
    int range = max - min;
    int length = 20;
    int[] data = new int[length];
    for (int i = 0; i < length; i++) {
      data[i] = (int) (Math.random()*range+min);
    }
    System.out.println(Arrays.toString(data));
    int[] reverted = new int[length];
    for (int i = 0; i < length; i++) {
      int src_pos = i;
      int dst_pos = length - i - 1;
      reverted[dst_pos] = data[src_pos];
    }
    String s = Arrays.toString(reverted);
    System.out.println(s);

    int[] negatives = ;
    int[] odd = ;
    int[] even = ;







  }
}
