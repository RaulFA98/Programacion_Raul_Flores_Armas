/************
DogDriver.java

Raul Flores Armas 
This program creates dogs objectsand uses Dog Class
********************/
import javax.swing.*;
public class DogDriver
{
  public static void main(String[]args)
   {
     Dog fido;

     fido = new Dog();
     fido.setColor("black");
     fido.setEyeColor("gray");

     JOptionPane.showMessageDialog(null,fido.getColor());

     JOptionPane.showMessageDialog(null,fido.getEyeColor());

     Dog firu;
     firu = new Dog();
     firu.setColor("Black and Blue");
     firu.setEyeColor("gray");


     JOptionPane.showMessageDialog(null,firu.getColor());

     JOptionPane.showMessageDialog(null,firu.getEyeColor());

     fido.eat();
     fido.bark();
     fido.sleep();
   }
}
