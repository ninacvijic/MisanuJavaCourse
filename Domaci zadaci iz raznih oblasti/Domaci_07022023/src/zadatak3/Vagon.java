package zadatak3;

public class Vagon extends Vozilo { // vagon je vozilo

	private Teret[] tereti; // vagon sadrzi niz tereta
	private int brTereta;
	private int kapacitet;

	Vagon() {

	}

	Vagon(int tez, int kapacitet) {
		super(tez);
		this.kapacitet = kapacitet;
		tereti = new Teret[kapacitet]; // stvara se prazan niz zadanog kapaciteta
		brTereta = 0;
	}

	public void setTeret(Teret teret) { // tereti se dodaju pojedinacno
		if (brTereta >= kapacitet) {
			System.out.println("Kapacitet niza je prekoračen!");
		} else {
			tereti[brTereta++] = teret;
		}
	}

	public int vucnaSila() { // implem.metode
		return 0; // vucna sila vagona je 0, iz postavke zadatka
	}

	public String toString() { // teks.opis, iz postavke zadatka
		String opis = "V(" + ukTezina() + " | ";
		for (int i = 0; i < brTereta; i++) {
			opis += tereti[i].toString();
			if (i < brTereta - 1) {
				opis += ", ";
			}
		}
		opis += ")";
		return opis;
	}

}
