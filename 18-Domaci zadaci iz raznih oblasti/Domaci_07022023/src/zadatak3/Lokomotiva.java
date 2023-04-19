package zadatak3;

public class Lokomotiva extends Vozilo { // lokomotiva je vozilo

	private int vucnaS; // podatak-vucna sila

	Lokomotiva() {

	}

	Lokomotiva(int tez, int vucnaS) {
		super(tez); // nasledjuje
		this.vucnaS = vucnaS;
	}

	public int vucnaSila() { // implemen.apstr.metode iz Vozilo
		return vucnaS;
	}

	public String toString() { // implemen.druge apstr.metode iz Vozilo
		return "L(" + ukTezina() + " | " + vucnaS + ")";
	}

}
