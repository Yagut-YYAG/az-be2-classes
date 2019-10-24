package lesson05.warmup;

import lesson04.warmup.Lesson4Task1;

public class RandomApp {

  public boolean isUpper(char c) {
    return c >= 'A' && c <= 'Z';
  }

  public boolean isLower(char c) {
    return c >= 'a' && c <= 'z';
  }

  public boolean isVowel(char c) {
    char upper = Character.toUpperCase(c);
    return upper == 'A' || upper == 'E' || upper == 'I'
      || upper == 'O' || upper == 'U';
  }

  public boolean isConsonant(char c) {
    return ! isVowel(c);
  }



  public static void main(String[] args) {
    Lesson4Task1 t = new Lesson4Task1();
    String origin = t.generate_random_string(30);
    RandomApp app = new RandomApp();
    Result result = app.process(origin);

    result.print();
  }

  public Result process(String origin) {
    return new Result();
  }
}
