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

  public boolean isUpperConsonant(char c) {
    return isUpper(c) && isConsonant(c);
  }

  public boolean isUpperVowel(char c) {
    return isUpper(c) && isVowel(c);
  }

  public boolean isLowerConsonant(char c) {
    return isLower(c) && isConsonant(c);
  }

  public boolean isLowerVowel(char c) {
    return isLower(c) && isVowel(c);
  }

  public Result process(String origin) {

    StringBuilder uc = new StringBuilder();
    StringBuilder lc = new StringBuilder();
    StringBuilder uv = new StringBuilder();
    StringBuilder lv = new StringBuilder();

    for (int i = 0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      if (isUpperConsonant(c)) {
        uc.append(c);
      } else if (isUpperVowel(c)) {
        uv.append(c);
      } else if (isLowerConsonant(c)) {
        lc.append(c);
      } else if (isLowerVowel(c)) {
        lv.append(c);
      }
    }
    return new Result(origin,
        uc.toString(),
        uv.toString(),
        lc.toString(),
        lv.toString()
    );
  }

  public static void main(String[] args) {
    Lesson4Task1 t = new Lesson4Task1();
    String origin = t.generate_random_string(30);
    RandomApp app = new RandomApp();
    Result result = app.process(origin);
    result.setExtraData("Hello :)");
    app.print(result);
  }

  private void print(Result result) {
    result.getExtraData();
    System.out.printf("Origin:%s\nUC:%s\nUV:%s\nLC:%s\nLV:%s\n",
        result.getOrigin(),
        result.getUpper_consonants(),
        result.getUpper_vowels(),
        result.getLower_consonants(),
        result.getLower_vowels()
    );
  }

}
