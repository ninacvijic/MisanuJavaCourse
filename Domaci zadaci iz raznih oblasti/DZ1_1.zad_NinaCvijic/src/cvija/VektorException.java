package cvija;

public class VektorException extends Exception { // klasa gresaka pri radu sa vektorima
	
	                                    // Kodovi gresaka:
	public static final int OPSEG = 0, // -neispravan opseg indeksa
			INDEKS = 1, // -indeks izvan opsega
			DUZINA = 2; // -neusaglasene duzine vektora

	private static final String[] poruka = { // tekstovi poruka o greskama
			"Neispravan opseg indeksa!", 
			"Indeks je izvan opsega!", 
			"Neusaglasene duzine vektora!" 
			};

	private int sif; // sifra greske

	public VektorException(int s) {
		sif = s; // inicijalizacija
	}

	public int sifra() {
		return sif; // dohvatanje sifre
	}

	@Override
	public String toString() { // tekstualni opis
		return "*** " + poruka[sif];
	}

}
