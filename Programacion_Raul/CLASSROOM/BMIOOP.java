/*****************************
BMIOOP.java
Raul Flores Armas 

This class calculates the Body Mass Index
*****************************/
public class BMIOOP
{
  private String name; //nombre
  private int age; //edad
  private double weigth; //peso in pounds
  private double heigth; //altura in inches
  private final double KILOGRAMS_PER_POUND=0.45359237;
  private final double METERS_PER_INCH=0.0254;

  //Methods - Actions
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return this.name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }
  public int getAge()
  {
    return this.age;
  }

  public void setWeigth(double weigth)
  {
    this.weigth;
  }
  public double weigth()
  {
    return this.weight;
  }

  public void setHeigth(double heigth)
  {
    this.heigth;
  }
  public double heigth()
  {
    return this.heigth;
  }

  public double getBMI()
  {
    double bmi=this.weight*KILOGRAMS_PER_POUND/((this.heigth*METERS_PER_INCH)*(this.heigth*METERS_PER_INCH));
    return Math.round(bmi*100)/100;
  }

}
