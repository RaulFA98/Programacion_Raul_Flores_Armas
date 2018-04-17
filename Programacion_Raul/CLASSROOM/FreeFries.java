/********
FreeFries.java

Raul Flores Armas 

This program reads points scored by home team and opposing team and determines If the fans win free
**********/
import javax.swing.JOptionPane; //Para utilizar modo grafico GUI
public class FreeFries
{
  public static void main (String[] args)
  {
    int homePoints; //points scored by home team
    int opponentPoints; //points scored by opposing team

    homePoints = Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
    if (homePoints > opponentPoints && homePoints>=100)
    {
      JOptionPane.showMessageDialog (null, "A free order of French Fries for White Tigers Fans");
    }
  }
}
