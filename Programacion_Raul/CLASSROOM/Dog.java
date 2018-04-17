/************
Dog.java

Raul Flores Armas 
This class sets the dog's properties and methods
********************/
import javax.swing.*;

public class Dog
{
  //Dog's properties - Variables
  private String color;
  private String eyeColor;
  private double height;
  private double length;
  private double weight;

  /*metodo GET = Obtener
  metodo Set = Establecer*/

  //sets the dog's color
  public void setColor(String dogColor)
  {
    color = dogColor;
  }
  //gets the dog's color
  public String getColor()
  {
    return color;
  }

  //sets the dog's eye color
  public void setEyeColor(String dogEyeColor)
  {
    eyecolor=dogEyeColor;
  }
  //gets the dog's eye color
  public String getEyeColor()
  {
    return eyeColor;
  }

  //sets the dog's height
  public void setHeight(String dogHeight)
  {
    height=dogHeight;
  }
  //gets the dog's height
  public String getHeight()
  {
    return height;
  }

  //sets the dog's Length
  public void setLength(String dogLenght)
  {
    lenght=dogLenght;
  }
  //gets the dog's Length
  public String getLenght()
  {
    return lenght;
  }

  //sets the dog's Weight
  public void setWeight(String dogWeight)
  {
    weight=dogWeight;
  }
  //gets the dog's Weight
  public String getWeight()
  {
    return weight;
  }

  //Dog's Methods - actions

  //Sit method
  public void sit()
  {
    JOptionPane.showMessageDialog(null, "The dog is sat");
  }

  //Bark method
  public void bark()
  {
    JOptionPane.showMessageDialog(null, "The dog is barking");
  }

  //Lay Down method
  public void layDown()
  {
    JOptionPane.showMessageDialog(null, "The dog is laid down");
  }

  //Eat method
  public void eat;
  {
    JOptionPane.showMessageDialog(null, "The dog is eating");
  }

  //Sleep mehod
  public void sleep;
  {
    JOptionPane.showMessageDialog(null, "The dog is sleeping");
  }
}
