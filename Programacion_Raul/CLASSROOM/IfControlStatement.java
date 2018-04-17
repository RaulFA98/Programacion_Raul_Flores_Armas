/*************
IfControlStatement.java

Raul Flores Armas 
This program checks the period at the end of line.
*************/

import javax.swing.JOptionPane;

public class IfControlStatement
{
  public static void main(String[]args)
  {
    String sentence;
    int lastCharPosition;
    sentence= JOptionPane.showInputDialog("Enter your sentence");
    //Hola mundo.
    lastCharPosition = sentence.length() - 1;


    if (sentence.charAt(lastCharPosition) != '.')
    {
      JOptionPane.showMessageDialog(null, "Invalid Entry - Your Sentence needs a period");

    }//end if
  }//end main
}//end class
