package cvija;

public class ObjekatKaoParametarKonstruktoraPrikaz {

	public static void main(String[] args) {
		
		// Objekat kao parametar konstruktora
		
		Circle c1 = new Circle(10); // parametar ima vrednost 10  //  **
		Circle c2 = new Circle(c1);  // c1 je objekat koji je vec kreiran // ***
		
		System.out.println("Povrsina kruga: " + c2.area());

	}

}
