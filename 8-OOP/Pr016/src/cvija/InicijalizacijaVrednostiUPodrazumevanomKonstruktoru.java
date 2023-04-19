package cvija;

public class InicijalizacijaVrednostiUPodrazumevanomKonstruktoru {

	public static void main(String[] args) {
		
		Box b1 = new Box(); // u trenutku kreiranja objekta, pozvace se
		// podrazumevani konstruktor
		
		Box b2 = new Box();
		
		b1.initBox(10, 15, 20);  // poziv metode za objekat b1 (sa navedenim argumentima za odredjene parametre)
		b2.initBox(5, 6, 7);
		
		System.out.println("Zapremina " + b1.volume()); // poziv druge metode iz pomocne klase Box
		System.out.println("Zapremina " + b2.volume());

	}

}
