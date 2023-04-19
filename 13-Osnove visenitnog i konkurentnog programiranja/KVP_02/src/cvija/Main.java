package cvija;

public class Main {

	public static void main(String[] args) {
	
		// Pokretanje nove niti
		// Novu nit pokrecete tako sto napravite instancu objekta tipa Thread.
		// To se moze uraditi na 2 nacina:
		// 1.nacin- Implementacija interfejsa Runnable // ovo sada radimo u ovom primeru *
		// 2.nacin - Prosirivanjem(nasledjivanjem) klase Thread  // ovo cemo raditi u sl.primeru!
		
		// -------------------------------------------------------------------------
		
		// U main klasi:
		// Nakon kreiranja klase koja implementira interfejs Runnable, potrebno je
		// napraviti instancu objekta tipa Thread.  //***
		
		A a = new A(); // pravimo objekat pomocne klase // **
		
		// *** Oblik konstruktora:
		// Thread(Runnable objekatNit, String imeNiti)  // npr.: Thread(a, "Nit1")
		// objekatNit je instanca klase koja implementira interfejs Runnable.  // npr to je ovde a
		// Definise mesto gde zapocinje nit.
		
		// imeNiti - predstavlja ime nove niti (koje vi zadajete)  // npr to je ovde "Nit1"
		
		Thread t1 = new Thread(a, "Nit1");  // isti objekatNiti za sva 3, ali im je drugaciji naziv
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		t1.start(); // metoda start() poziva metodu run() // pokrecemo metodu koju smo napravili
		            // u run navedemo sta ce se izvrsavati // a start kada ce se izvrsavati, tj pocne se izvrsavati kad kreiramo start()
		t2.start();
		t3.start();

	}

}

// u ovom zadatku imamo 4 niti(3 od t1, t2 i t3, i 1 glavna nit)  // glavna nit nastaje bez obzira na sve!
