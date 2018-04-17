/*
Alejangro Méndez Reyes
GeometricObject
*/

public class GeometricObject
{
  private String color;
  private boolean filled;
  private Date dateCreated;
  public GeometricObject()

  {
    this.color= "Blue";
    this.filled= true;
    this.dateCreated = new Date();
  }
  public GeometricObject (String color, boolean filled)
  {
    this.color=color;
    this.filled= filled;
    this.dateCreated=new Date();
  }
  public String getColor()
  {
    return this.color;
  }
  public void setColor(String color)
  {
    this.color=color;
  }
  public boolean isFilled()
  {
    return this.filled;
  }
  public void setFilled (boolean filled)
  {
    this.filled = filled;
  }
  public Date getDateCreate()
  {
    return this.dataCreated;
  }
}
