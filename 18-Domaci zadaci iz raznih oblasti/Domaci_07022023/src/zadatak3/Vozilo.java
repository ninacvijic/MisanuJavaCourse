package zadatak3;

public abstract class Vozilo {

	protected int tez; // podatak - vozilo ima sopstvenu tezinu

	Vozilo() {

	}

	Vozilo(int tez) { // konstr.
		this.tez = tez;
	}

	public abstract int vucnaSila(); // apstr.metoda za odredjivanje vucne sile vozila

	public int ukTezina() { // odredjivanje ukupne tezine
		return tez + vucnaSila(); // ukupna tezina = tezina + vucna sila
	}

	public abstract String toString(); // tekst.opis vozila

}
