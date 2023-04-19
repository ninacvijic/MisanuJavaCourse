package cvija;

public class BoxPrikaz {

	public static void main(String[] args) {
		
		// Koriscenje promenljive klase u drugoj klasi
		
		Box b1 = new Box();
		
		double zapremina;
		
		b1.sirina = 10;  // kako u pom.klasi nije naveden konstruktor, svi podaci imaju defoltne vrednosti ( ovde 0 )
		b1.visina = 15;   // tek kad smo dodelili vrednosti 10, 15 i 20 one prestaju biti nula!
		b1.dubina = 20;
		
		// formula za zapreminu: zapremina = sirina*visina*dubina
		zapremina = b1.sirina * b1.visina * b1.dubina;
		
		System.out.println("Zapremina: " + zapremina);

	}

}
