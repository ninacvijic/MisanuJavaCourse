package cvija;

public class Circle {
	
	private double radius;
	
	Circle() {  // 1.konstruktor bez parametara
		radius = 0.0;  // inicijalizacija
	}
	
	Circle(double radius) {  // 2.konst.-ima 1 parametar  // **
		this.radius = radius;
	}

	Circle(Circle ob) {  // 3.konstruktor-ima objekat kao parametar  // ***
		radius = ob.radius;   // ob je objekat klase Circle  // ovo je postupak inicijalizacije polja (atributa) objekta klase
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
}
