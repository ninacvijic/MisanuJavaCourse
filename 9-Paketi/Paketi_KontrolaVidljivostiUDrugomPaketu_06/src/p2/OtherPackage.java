package p2;

public class OtherPackage {

	OtherPackage() {  // konstruktor
		p1.Base p = new p1.Base();  // umesto da pisemo gore import p1.*; tokom kreiranja objekta klase iz prvog paketa navodimo p1. !!!
		// nazivPaketa.nazivKlase u tom paketu  naziv objekta = new nazivPaketa.nazivKlase();
		// sa p1. navodimo iz kog paketa pozivamo klasu Base
		
		System.out.println("Konstruktor klase OtherPackage");
		// System.out.println("n_pri = " + p.n_pri);  // zakomentarisano je sve sto ne prolazi, javlja se error zbog vidljivosti
		// System.out.println("n_def = " + p.n_def);
		// System.out.println("n_pro = " + p.n_pro);
		System.out.println("Klasa OtherPackage: n_pub = " + p.n_pub);  // samo public ovde prolazi
	}
}
