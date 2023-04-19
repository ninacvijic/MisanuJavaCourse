package cvija;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	Box(double w, double h, double d) {  // konstruktor sa parametrima
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {  // metoda
		return width * height * depth;
	}

}
