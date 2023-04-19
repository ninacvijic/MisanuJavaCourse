package cvija;

public class Pravougaonik extends Oblik {

	double duzina;
	double sirina;

	public Pravougaonik(double d, double s) { // konstruktor
		duzina = d;   // moglo je i sa this
		sirina = s;
	}

	public double uzmiPovrsinu() {
		povrsina = duzina * sirina;  // *novo*
		return povrsina;
	}

}
