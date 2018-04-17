/****************
GreatestNumber.java

Raul Flores Armas 
This program finds three numbers
***************/
import javax.swing.JOptionPane;
public class GreatestNumber
{
  public static void main(String[]args)
  {
    double numberOne, numberTwo, numberThree;

    numberOne=Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
    numberTwo=Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
    numberThree=Double.parseDouble(JOptionPane.showInputDialog("Enter the third number"));
    if (numberOne > numberTwo)
    {
      if (numberOne > numberThree)
      {
        JOptionPane.showMessageDialog(null, "The Greatest Number Is: " + numberOne);
      }
    }
    if (numberTwo > numberOne)
    {
      if (numberTwo > numberThree)
      {
        JOptionPane.showMessageDialog(null, "The Greatest Number Is: " + numberTwo);
      }
    }
    if (numberThree > numberOne)
    {
      if (numberThree > numberTwo)
      {
        JOptionPane.showMessageDialog(null, "The Greatest Number Is: " + numberThree);
      }
    }
  }
}
