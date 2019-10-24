package lesson05.warmup;

public class Result {
  private final String origin;
  private final String upper_consonants;
  private final String upper_vowels;
  private final String lower_consonants;
  private final String lower_vowels;
  private String extraData;

  // constructor
  public Result(String origin,
                String upper_consonants,
                String upper_vowels,
                String lower_consonants,
                String lower_vowels) {
    this.origin = origin;
    this.upper_consonants = upper_consonants;
    this.upper_vowels = upper_vowels;
    this.lower_consonants = lower_consonants;
    this.lower_vowels = lower_vowels;
  }

  // getter
  public String getOrigin() {
    return origin;
  }

  public String getUpper_consonants() {
    return upper_consonants;
  }

  public String getUpper_vowels() {
    return upper_vowels;
  }

  public String getLower_consonants() {
    return lower_consonants;
  }

  public String getLower_vowels() {
    return lower_vowels;
  }

  // getter
  public String getExtraData() {
    return extraData;
  }

  // setter
  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }
}
