
/**********
Raul Flores Armas 

PrintPurchaseOrder.java
This program calculate and prints a purchase order amount
*********/

import java.util.Scanner;
public class PrintPurchaseOrder
{
  public static void main(String[] args)
  {
    Scanner userData=new Scanner(System.in);
    String name;
    double price;
    int quantity;
    System.out.println("Enter the name");
    name= userData.nextLine();
    System.out.println("Enter the price ");
    price= userData.nextDouble();
    System.out.println("Enter the quantity");
    quantity= userData.nextInt();

    System.out.println("The product " + name + " total purchase order: $" + price*quantity);
  }
}
=======
/**********
Alejandro Méndez Reyesimport

PrintPurchaseOrder.java
This program calculate and prints a purchase order amount
*********/

import java.util.Scanner;
public class PrintPurchaseOrder
{
  public static void main(String[] args)
  {
    Scanner userData=new Scanner(System.in);
    String name;
    double price;
    int quantity;
    System.out.println("Enter the name");
    name= userData.nextLine();
    System.out.println("Enter the price ");
    price= userData.nextDouble();
    System.out.println("Enter the quantity");
    quantity= userData.nextInt();

    System.out.println("The product " + name + " total purchase order: $" + price*quantity);
  }
}
>>>>>>> origin/master
