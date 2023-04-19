package cvija;

public class PutnickoVozilo extends Vozilo {

	private int brPutnika;
	private double prosecnaTezinaPutnika;

	public PutnickoVozilo(double tezina, int brPutnika, double prosecnaTezinaPutnika) {
		super(tezina);
		this.brPutnika = brPutnika;
		this.prosecnaTezinaPutnika = prosecnaTezinaPutnika;
	}

	public char vrstaVozila() {
		return 'P';
	}

	public double getTezina() {
		return super.getTezina() + brPutnika * prosecnaTezinaPutnika;
	}

	public String toString() {
		return super.toString() + ", broj putnika: " + brPutnika + " , prosecna tezina putnika: "
				+ prosecnaTezinaPutnika;
	}

}
