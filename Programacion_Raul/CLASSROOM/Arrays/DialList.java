/**************************
DialList.java

Raul Flores Armas 
This program creates a cell phone dial phone number list and prints the created list
****************/

import javax.swing.*;
public class DialList
{
 public static void main (String []args)
 {
  long [] phoneList; //List of phone number
  int sizeList; //number of phone numbers
  long phoneNum; //an entered phone number

  sizeList = Integer.parseInt(JOptionPane.showInputDialog("How many phone number would you like to enter?"));
  phoneList= new long [sizeList]; //Inizializando
  for (int i = 0; i < sizeList ; i++ )
  {
   phoneNum = Long.parseLong(JOptionPane.showInputDialog("Enter a Phone Number: "));
   phoneList[i]= phoneNum;
  }
  for (int i=0 ; i < sizeList ; i++ )
  {
   JOptionPane.showMessageDialog(null, "index " + i + " element number: " + (i+1) + " Phone number: " + phoneList[i]);
  }
 }
}
