/*************
Raul Flores Armas 
WileLoop.java
This program make sentries in a bridal registry
*************/

import javax.swing.JOptionPane;

public class WileLoop
{
  public static void main (Strin[]args)
  {
    String registry = "";
    char more;
    more= JOptionPane.showInputDialog("Do you want to create a bridal registry? (y/n)").charAt(0);
    while(more=="y")
    {
      registry +=JOptionPane.showInputDialog("Enter item: ");
      registry +=JOptionPane.showInputDialog("Enter store");
      registry +="\n";
      more= JOptionPane.showInputDialog("any more items? (y/n)").charAt(0);
    }
    if(!registry.equals(""))
    {
      JOptionPane.showMessageDialog(null, "\n Bridal registry\n" + registry);
    }
  }
}
