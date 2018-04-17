/*
Rectangle2.java
*/
public class Rectangle2 extends GeometricObject;
{
  private double width;
  private double height;

  public Rectangle2()
  {

  }
  public Rectangle2( double width, double height)
  {
    this.width=width;
    this.height=height;
  }
  public Rectangle2 (double width, double height, String color, boolean filled)
  {
    super (color, filled);
    this.width=width;
    this.height=height;
  }
}
