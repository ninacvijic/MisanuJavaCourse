package cvija;

// Static metoda klase

public class metodastaticPrikaz {

	public static void main(String[] args) {
		
		// A a = new A();   // mozemo napraviti objekat ako nam je potreban
		// a.prikaziPoruku();  // onda pozivamo metodu preko objekta

		// nazivKlase.nazivMetode();   // mozemo pozvati metodu bez kreiranja objekta
		A.prikaziPoruku();             // to smo uspeli jer smo stavili kljucnu rec static, tj napravili staticku metodu
	}

}
