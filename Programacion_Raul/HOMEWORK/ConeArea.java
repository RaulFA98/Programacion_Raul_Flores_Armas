/******
* Raul Flores Armas 
* ConeArea.java
* This program calculate the area of ​​a cone
******/
public class ConeArea
{
  public static void main (String[]args)
  {
    double R;
    R= 15;
    double H;
    H = 20;
    double C;
    C= SQRT ((H*H)-(R*R));
    double resultado;
    resultado=(C*R)+((3.1416*(R*R))/2);
    System.out.println("El area del Cono es: " + resultado);
  }//end main
}//end ConeArea
