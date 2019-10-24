package lesson05.geometric_interface;

public class GeometricApp2 {
  public static void main(String[] args) {
    // primary constructor
    Circle circle1 = new Circle(new Point(1, 2), 5);
    // secondary constructor
    Circle circle2 = new Circle();

    Figure circle = new Circle();
    Figure rectangle = new Rectangle();
    Figure square = new Square();
    circle.area();
    rectangle.area();

    if (circle instanceof Circle) {
      // true
    }
    if (circle instanceof Figure) {
      // true
    }
    if (circle instanceof Drawable) {
      // true
    }
    if (circle instanceof Object) {
      // true
    }

  }
}
