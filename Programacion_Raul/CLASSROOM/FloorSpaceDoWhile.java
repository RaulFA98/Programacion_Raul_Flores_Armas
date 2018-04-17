/************
FloorSpaceDoWhile.java

Raul Flores Armas 
This program calculates total floor spacein a house.
************/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile
{
  public static void main (String[]args)
  {
    double lengh, width; //room dimesions
    double floorSpace=0; //house's total floor space
    char response;//user's response
    do{
      lengh=Double.parseDouble(JOptionPane.showInputDialog("Enter the room's lenght"));
      width=Double.parseDouble(JOptionPane.showInputDialog("Enter the room's width"));
      floorSpace += lengh * width;
      response=JOptionPane.showInputDialog("Any more room? y/n").charAt(0);
    }while(response=='y' || response=='Y');
    JOptionPane.showMessageDialog(null, "The total floor space is " + floorSpace);
  }
}
