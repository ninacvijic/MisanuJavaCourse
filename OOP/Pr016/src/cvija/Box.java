package cvija;

public class Box {
	
	private double width;  // 3 privatna polja
	private double height;
	private double depth;
	
	void initBox(double w, double h, double d) {  // prva metoda
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {   // druga metoda
		return width * height * depth;
	}

}
