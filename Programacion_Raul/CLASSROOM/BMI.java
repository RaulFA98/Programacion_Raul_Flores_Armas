/***************************
BMI.java

Raul Flores Armas 
This program calculates the Body Mass Index
******************/

import javax.swing.JOptionPane;
public class BMI
{
  public static void main (String[]args)
  {
    float weight, height;
    final double KILOGRAMS_PER_OUND= 0.45359237;
    final double METERS_PER_INCH= 0.0254;

    weight=Float.parseFloat(JOptionPane.showInputDialog("Enter your weight in pounds "));
    height=Float.parseFloat(JOptionPane.showInputDialog("Enter your height in inches "));

    double weightInKilograms=weight*KILOGRAMS_PER_OUND;
    double heightInMeters=height*METERS_PER_INCH;

    double bmi=weightInKilograms/(Math.pow(heightInMeters,2));
    if (bmi<16)
    {
      JOptionPane.showMessageDialog(null, "You're seriously underweight");
    }
    else if (bmi<18)
    {
      JOptionPane.showMessageDialog(null, "You're underweight");
    }
    else if (bmi<24)
    {
      JOptionPane.showMessageDialog(null, "You're normal weight");
    }
    else if (bmi<29)
    {
      JOptionPane.showMessageDialog(null, "You're overweight");
    }
    else if (bmi<35)
    {
      JOptionPane.showMessageDialog(null, "You're seriously overweight");
    }
    else
    {
      JOptionPane.showMessageDialog(null, "You're gravely overweight");
    }
  }
}
