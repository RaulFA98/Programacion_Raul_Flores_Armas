/******
* Raul Flores Armas
* Gallon.java
* This program calculate the price for gallon
******/
import java.util.Scanner;
public class Gallon
{
  public static void main (String[]args)
  {
    Scanner userData= new Scanner (System.in);
    double L;
    System.out.print("Ingrese cantidad de litros que produce: ");
    L= userData.nextDouble();
    double PL;
    System.out.print("Ingrese costo por litro: ");
    PL=userData.nextDouble();
    double PG;
    System.out.print("Ingrese costo por galón: ");
    PG= userData.nextDouble();
    double TG;
    TG= L/3.785
    double GA;
    GA= (PG*TG)-((L/20)*PL);
    System.out.println("La ganancia fue de " + GA);
  }
}
