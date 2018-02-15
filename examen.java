/*********************
examen.java

Raul Flores Armas
This program receives a password and on the third attempt, it is canceled
**********************/

import javax.swing.*;
public class examen{
  public static void main (String[]args){
    String Attempt="";
    int C=1;
    while (C<=3 && Attempt!= "password"){
     Attempt=JOptionPane.showInputDialog("Enter the password, attempt: " + C);
     if (Attempt=="password" && C<=3){
       JOptionPane.showMessageDialog(null,"Enhorabuena");
     }else{
       JOptionPane.showMessageDialog(null,"The password is incorrect, try again");
     }
     C ++;
    }
  }
}
