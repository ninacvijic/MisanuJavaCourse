package cvija;

public class Circle {
	
	private double radius;
	
	Circle(double rad)  // Konstruktor klase koji inicijalizuje jedan podatak.  // Prethodni primer: Circle()
	{
		radius = rad;  // Prosli primer: radius = 10.0;
	}                  // rad = 10 (vidimo u main klasi)
	
	public double area()
	{
		return 3.14 * radius * radius;
	}
	

}
