package cvija;

public class Kanta extends Valjak {

	private double puno; // napunjeni deo

	Kanta(double rr, double hh, double pp) {
		super(rr, hh);
		puno = pp <= V() ? pp : V();
	}

	Kanta(double rr, double hh) {
		this(rr, hh, 0); // prazna kanta
	}

	public double ima() { // koliko ima tecnosti
		return puno;
	}

	public double fali() { // koliko tecnosti fali
		return V() - puno;
	}

	public boolean puna() { // da li je puna
		return V() == puno;
	}

	public boolean prazna() { // da li je prazna
		return 0 == puno;
	}

	public Kanta dolij(double dopuna) { // Dolivanje
		puno = (puno + dopuna <= V()) ? puno + dopuna : V();
		return this;
	}

	public Kanta odlij(double odliv) { // Odlivanje
		if (puno - odliv > 0)
			puno -= odliv;
		else
			puno = 0;
		return this;
	}

	public Kanta presipaj(Kanta k) { // Presipanje
		if (this != k) {
			double prazno = V() - puno;

			if (prazno >= k.puno) {
				puno += k.puno;
				k.puno = 0;
			} else {
				puno = V();
				k.puno -= prazno;
			}
		}
		return this;
	}

	public String toString() {
		return "(" + super.toString() + "," + puno + ")";
	}

}
