/************************
Raul Flores Armas

************************/
public class Hourly extends Employee
{
  private double hourlyRate;
  private double hours=0.0;

  public Hourly(String name, double hours)
  {
    super (name);
    this.hours= hours;
  }

  public double getPay()
  {
   double pay=hourlyRate*hours;
   return pay;
  }

  public void addHours(double hours)
  {
    this.hours= hours;
  }
}
