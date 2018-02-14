/******
* Raul Flores Armas
* VolumePool.java
* This program calculate the volume of a pool
******/
import java.util.Scanner;
public class VolumePool
{
  public static void main (String[]args)
  {
    Scanner userData = new Scanner(System.in);
    double A; //Altura de la Alberca
    System.out.print("Ingrese altura de la alberca: ");
    A=userData.nextDouble();
    double L; //Largo de la Alberca
    System.out.print("Ingrese largo de la alberca: ");
    L =userData.nextDouble();
    double N; //Ancho de la Alberca
    System.out.print("Ingrese ancho de la alberca: ");
    N=userData.nextDouble();
    double CM; //Costo por metro cubico
    System.out.print("Ingrese costo por metro cubico: ");
    CM=userData.nextDouble();
    double V; //Volumen de la Alberca
    V= A*L*N;
    double PAG; //Pago a realizar por el consumo
    PAG=V*CM;
    System.out.println("El volumen de la alberca es: " + V + " , el precio a pagar es: " + PAG);
  }//end main
}//end VolumePool
