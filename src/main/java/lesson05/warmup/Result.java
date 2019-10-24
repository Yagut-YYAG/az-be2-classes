package lesson05.warmup;

public class Result {
  private String lower_vowels;
  private String lower_consonants;
  private String upper_vowels;
  private String upper_consonants;

  public Result() {}

  public Result(String lower_vowels, String lower_consonants, String upper_vowels, String upper_consonants) {
    this.lower_vowels = lower_vowels;
    this.lower_consonants = lower_consonants;
    this.upper_vowels = upper_vowels;
    this.upper_consonants = upper_consonants;
  }

  public String getLower_vowels() {
    return lower_vowels;
  }

  public String getLower_consonants() {
    return lower_consonants;
  }

  public String getUpper_vowels() {
    return upper_vowels;
  }

  public String getUpper_consonants() {
    return upper_consonants;
  }

  public void print() {

  }
}
