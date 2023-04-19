package cvija;

public class Main {

	public static void main(String[] args) {
	
	//	A<T, V> objekat1 = new A<T, V>(null, null);   // kreiranje objekta koji ima 2 parametra, tj 2 tipa podataka
		A<Integer, String> objekat1 = new A<Integer, String>(100, "Java");
		objekat1.prikaziTip();
		
		int intvrednost = objekat1.getObj1();  // proizvoljne promenljive u koje smestamo nase podatke
		System.out.println("Vrednost: " + intvrednost);
		
		String strvrednost = objekat1.getObj2();
		System.out.println("Vrednost: " + strvrednost);

		
		// A<T, V> objekat2 = new A<T, V>(null, null);
		A<String, Double> objekat2 = new A<String, Double>("tekst123", 123.45);
		objekat2.prikaziTip();
		
		String s2 = objekat2.getObj1();
		System.out.println("Vrednost: " + s2);
		
		double d2 = objekat2.getObj2();
		System.out.println("Vrednost: " + d2);
		
		//*
		A<Boolean, Integer> objekat3 = new A<Boolean, Integer>(true, 101);
		objekat3.prikaziTip();
		
		boolean b3 = objekat3.getObj1();  // paziti sta se poziva, da je Obj1 za T, moze se lako pogresiti na sta se misli!
		// prof pisao ovo Boolean iznad velikim slovom, moze li to??? radi
		System.out.println("Vrednost: " + b3);  
		int i3 = objekat3.getObj2();
		System.out.println("Vrednost: " + i3);
	}

}
//Chat:
//Moguće je proslediti objekte kao parametre metodama.
//Ovo može biti korisno ako želite da izvršite operaciju nad objektom ili 
//na neki način izmenite njegovo stanje.
