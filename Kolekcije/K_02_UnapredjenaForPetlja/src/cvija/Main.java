package cvija;

public class Main {

	public static void main(String[] args) {
		
		int[] niz = {2, 5, 7, 9, 29};
		
		// stampanje elementa niza
		System.out.println("Stampanje elemenata niza for petljom: ");  // standardna petlja, koju smo do sad ucili
		for(int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		// II nacin:  // u ovoj petlji nemamo nikakav dodir s indeksima, vec samo prolazimo kroz niz i ispisujemo njegove parametre
		System.out.println("\nStampanje elemenata niza unapredjenom for petljom: ");  // **novo** // od sada ovu petlju korisiti!
		for(int i : niz)   // parametar je int i               
			System.out.println(i);  // u stampi samo stavljamo i, nema uglastih zagrada kao gore!
	}

}
