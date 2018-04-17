/************
PositiveNegative.java

Raul Flores Armas 
This program tells if a number is positive or negative
************/

import javax.swing.JOptionPane;
public class PositiveNegative
{
  public static void main (String[]args)
  {
    int num;
    num=Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
    if (num>0)
    {
      JOptionPane.showMessageDialog(null, "The number " + num + " is positive");
    }else{
      JOptionPane.showMessageDialog(null, "The number " + num + " is negative");
    }
  }
}
