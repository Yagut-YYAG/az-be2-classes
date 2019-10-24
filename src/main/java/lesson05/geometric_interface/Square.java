package lesson05.geometric_interface;

public class Square implements Figure {
  private final Point center;
  private final int edge;

  public Square() {
    this(new Point(), Rnd.value());
  }

  public Square(Point center, int edge) {
    this.center = center;
    this.edge = edge;
  }

  @Override
  public int area() {
    return (int) Math.pow(this.edge, 2);
  }

}
