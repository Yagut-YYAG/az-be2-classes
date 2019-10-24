package lesson05.geometric_interface;

public class Circle implements Figure, Drawable {

  private final Point center;
  private final int radius;

  public Circle() {
    this(new Point(), Rnd.value());
  }

  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null) return false;
    if (this == that) return true;
    if (!(that instanceof Circle)) return false;
    Circle thatCircle = (Circle) that;
    return (this.radius == thatCircle.radius)
        && (this.center.equals(thatCircle));
  }

  @Override
  public int area() {
    return (int) (Math.PI * Math.pow(radius, 2));
  }

  @Override
  public void draw() {
    System.out.println("Circle is going to be drawing");
  }
}
