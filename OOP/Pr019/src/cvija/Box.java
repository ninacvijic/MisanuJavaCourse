package cvija;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	Box(double width, double height, double depth) {  // konstruktor sa parametrima // i this
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width * height * depth;
	}

}
