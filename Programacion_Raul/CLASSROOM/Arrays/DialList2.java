/***************************
DialList2.java

Raul Flores Armas
This Program creates a dial phone number list and prints the the created list. It uses a partially filled array
****************************/
import javax.swing.*;
public class DialList2
{
 public static void main (String [] args)
 {
  String [] phoneList = new String [100]; //Declaracion e inicializacion
  int filledNumbers = 0; // number of phones
  String phoneNum; //an entered phone number

  phoneNum = JOptionPane.showInputDialog(null, "Enter a phone number (or press q to Quit)");
  while (!phoneNum.equalsIgnoreCase("q") && filledNumbers < phoneList.length)
  {
   if (phoneNum.length() <10)
   {
    JOptionPane.showMessageDialog(null, "Must enter a valid number (10 characters)");
   }else{
    phoneList[filledNumbers] = phoneNum;
    filledNumbers ++;
   }
   phoneNum = JOptionPane.showInputDialog(null, "Enter a phone number (or press q to Quit)");
  }
  JOptionPane.showMessageDialog (null, "Dial List");
  for (int i= 0; 1 < filledNumbers; i++)
  {
   JOptionPane.showMessageDialog (null, (i+1) + " phone " + phoneList [i]);
  }
 }
}
