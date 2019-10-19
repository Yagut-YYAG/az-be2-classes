package lesson03.override;

public class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("I'm a dog. I can bark");
  }
}
