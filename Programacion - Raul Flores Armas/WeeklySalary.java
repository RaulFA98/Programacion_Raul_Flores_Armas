/******
* Raul Flores Armas 
* WeeklySalary.java
* This program calculate the salary of a week
******/
import java.util.Scanner;
public class WeeklySalary
{
  public static void main(String[]aegs)
  {
    Scanner userData = new Scanner(System.in);
    double HT;
    System.out.print("Ingrese cantidad de horas diarias trabajadas: ");
    HT= userData.nextDouble();
    double PH;
    System.out.print("Ingrese pago por hora: ");
    PH= userData.nextDouble();
    double DT;
    System.out.print("Ingrese cantidad de dias trabajados: ");
    DT= userData.nextDouble();
    double SS;
    SS=(HT*PH)*DT;
    System.out.println ("El salario del empleado es: " + SS);
  }
}
