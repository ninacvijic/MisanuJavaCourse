package cvija;

public class ProsledjivanjeObjektaMetodiPrikaz {

	public static void main(String[] args) {

		// Prosledjivanje objekta metodi

		Circle c1 = new Circle(20); // pravimo objekat (instancu) klase sa argumentom 20
		// Circle c2 = new Circle(30);  // mogli smo napraviti i drugi objekat

		calcArea(c1); // poziv konkretno za objekat c1
		// moze i : calcArea(c2); // poziv konkretno za objekat c2  // tad bi dole izbacilo i povrsinu za c2
	}

	// Upotreba static metode:  // nova metoda u ovom primeru koja kao parametar ima klasu Circle!!!
	
	public static void calcArea(Circle c) { // opsti oblik-metoda, napisano za bilo koji objekat klase Circle, racuna povrsinu za bilo koji objekat klase Circle 
		System.out.println("Povrsina kruga: " + c.area());    // c1 vs c ??
	}                      // moglo i npr (Circle asd), a dole asd.area(); // proizvoljan naziv

}
