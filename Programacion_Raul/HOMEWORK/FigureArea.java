/******
* Raul Flores Armas 
* FigureArea.java
* This program calculate the area of a figure
******/
import java.util.Scanner;
public class FigureArea
{
  public static void main (String[]args)
  {
    Scanner userData= new Scanner (System.in);
    double A;
    System.out.println ("Ingrese la altura mayor");
    A = userData.nextDouble();
    double C;
    System.out.println ("Ingrese la altura menor");
    C = userData.nextDouble();
    double B;
    System.out.println ("Ingrese la Base");
    B = userData.nextDouble();
    double resultado;
    resultado=(C * B) + (((A-C)*B)/2);
    System.out.println("El area de la figura es: " + resultado);
  }//end main
}//end FigureArea
