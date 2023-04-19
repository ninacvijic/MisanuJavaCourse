package cvija;

public class Circle {
	
	private double poluprecnik;
	
	Circle()  // konstruktor
	{
		poluprecnik = 10.0;
	}
	
	// poluprecnik ima vrednost 10, koja je postavljena u konstruktoru
	// prilikom kreiranja objekta
	
	public double area()    // implementira se metoda kojom se racuna povrsina kruga
	{
		return 3.14 * poluprecnik * poluprecnik;
	}

}
