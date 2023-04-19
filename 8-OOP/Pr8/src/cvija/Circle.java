package cvija;

public class Circle {
	
	private double radius;
	
	Circle()
	{
		radius = 0.0;
	}

	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double area()
	{
		return 3.14 * radius * radius;
	}
}
