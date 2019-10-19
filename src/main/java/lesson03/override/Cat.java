package lesson03.override;

public class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("I'm cat.I can meow");
  }
}
