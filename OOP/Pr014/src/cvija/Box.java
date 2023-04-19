package cvija;

public class Box {
	
	double width;
	double height;
	double depth;
	
	void volume() {  // metoda za izracunavanje zapremine
		System.out.print("Zapremina: ");
		System.out.println( width * height * depth );
	}

}
