package zadatak3;

public abstract class Teret {

	private static int identifikator = 0; // jedinstveni celobrojni identifikator
	private int id;
	private double tezina; // podatak

	Teret() { // podrazumevani konstruktor

	}

	Teret(double tezina) { // parametrizovani konstruktor
		this.id = identifikator;
		identifikator++; // generisemo celobr.identifikator
		this.tezina = tezina;
	}

	public double getTezina() { // dohvati tezinu
		return tezina;
	}

	public int getIdentifikator() {
		return identifikator;
	}

	public abstract char oznakaVrste(); // dohvati oznaku vrste

	public abstract int V(); // odredi zapreminu

	public String toString() {
		return oznakaVrste() + "-" + id; // tekstualni opis koji sadrzi oznaku vrste i identifikator
	}

}
