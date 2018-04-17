/*
ImplementGeometricObjects.java
*/
import javax.swing.*;
public class ImplementGeometricObjects
{
  public static void main (String[] args)
  {

    //Circle
    GeometricObject circlelito= new Circle(3.5, "Blue", true);

    JOptionPane.showMessageDialog(null,"The area is: " + circlelito.getArea());
    JOptionPane.showMessageDialog(null,"The circle was createed on: "circlelito.getDateCreated());

    //Rectangle
    GeometricObject rectangle2lito = Rectangle(10, 20,"Black", true);
    JOptionPane.showMessageDialog(null,"The area is: " + rectangle2lito.getArea());
    JOptionPane.showMessageDialog(null, "The perimeter is: " + rectangle2lito.getPerimeter());
    JOptionPane.showMessageDialog(null, "The rectangle was created on: " + rectangle2lito.getDateCreated());
    
    //Polimofismo
    JOptionPane.showMessageDialog(null,circlelito.toString());
    ciclelito.toString();
  }
}
