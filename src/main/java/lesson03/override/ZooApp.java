package lesson03.override;

public class ZooApp {

  public static void main(String[] args) {
    Animal a = new Animal();
    Animal d = new Dog();
    Animal c = new Cat();

    ComplicatedBehaivor smart = new ComplicatedBehaivor();
    smart.something(a);
    smart.something(d);
    smart.something(c);
    smart.something(new Animal(){
      @Override
      void sound() {
        System.out.println("Dinosaurus:)))");;
      }
    });

  }
}
