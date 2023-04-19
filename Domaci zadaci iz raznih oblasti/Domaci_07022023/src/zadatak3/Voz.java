package zadatak3;

import java.util.ArrayList;

public class Voz {

	private ArrayList<Vozilo> vozila; // voz se sastoji od niza vozila
	private int ukVucnaSila;

	Voz() {

	}

	Voz(int ukVucnaSila) {

		this.ukVucnaSila = ukVucnaSila;
		this.vozila = new ArrayList<Vozilo>(); // stvara se prazan niz vozila, niz je zadanog kapaciteta
	}

	public int getBrVozila() { // moze da se dohvati broj vozila u vozu
		return this.vozila.size();
	}

	public boolean preopterecenje(Vozilo vozilo) { // greska je ako se voz preoptereti, uslov u postavci zadatka
		int trenutnaTezina = 0;
		for (Vozilo v : this.vozila) {
			trenutnaTezina += v.ukTezina();
		}
		return trenutnaTezina + vozilo.ukTezina() > this.ukVucnaSila;
	}

	public void setVozilo(Vozilo vozilo) throws Exception { // vozila se dodaju pojedinacno
		if (preopterecenje(vozilo)) {
			throw new Exception("Voz bi se preopteretio usled dodavanja!");
		}
		this.vozila.add(vozilo);
	}

	public void opisVoza() { // tekst.opis, jedno vozilo po redu
		System.out.println("Voz sadrži vozila:\n");
		for (Vozilo v : vozila) {
			System.out.println(v.toString());
		}
	}

}
