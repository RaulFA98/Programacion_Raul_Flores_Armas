/***********
AverageWhile.java

Raul Flores Armas 
This program calculatesthe average of ten grades
***********/
import javax.swing.JOptionPane;

public class AverageWhile
{
  public static void main (String[]args)
  {
    int counter = 0 , totalStudents;
    double score, totalScore, averageScore =0;

    totalStudents=Integer.parseInt(JOptionPane.showInputDialog("Enter number of students"));
    while(counter <= totalStudents)
    {
      score= Double.parseDouble(JOptionPane.showInputDialog("Enter the score "+ counter));
      totalScore += score;
      counter ++;
    }
    averageScore= totaScore/ totalStudets;
    JOptionPane.showMessageDialog(null, "The average is " + averageScore);
  }
}
