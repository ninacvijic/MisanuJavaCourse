package cvija;

public class Main {

	public static void main(String[] args) {
		
		// Pravimo A objekat za tip Integer:
		A<Integer> intObjekat = new A<Integer>(100);  // *novo!*  // intObjekat proizvoljan naziv naseg objekta, pokazni primer, i br 100 je proizvoljan
		
		// String naziv;
		// int cena;
		// Knjiga k1 = new Knjiga("NDC", 1100); // ranije ovako radili
		
		intObjekat.prikaziTip();  // sa kreiranim objektom pozivamo metodu iz pomocne klase
                                  // u Consoli prikaze java.lang.Integer (dobili smo znaci Integer), ovo dole je samo pravilna sintaksa!
		
		// istestiracemo geter:
		int vrednostIntObjekta = intObjekat.getOb();  // paziti kako se poziva geter! // *novo*!!!
		System.out.println("Vrednost: " + vrednostIntObjekta);
		
		System.out.println("\n");  // da napravimo razmak
		
		// Pravi A objekat za tip String:
		A<String> stringObjekat = new A<String>("tekst");  // ovo do sad nismo mogli! // pravili smo odvojene metode ranije
		stringObjekat.prikaziTip();
		
		// geter: // poziv
		String str = stringObjekat.getOb();  // 2.nacin
		System.out.println("Vrednost: " + str);
		
		}

}  // Zakljucak: T je zamena za stvarni tip koji ce biti zadat u trenutku
   // kreiranja objekta klase A.
