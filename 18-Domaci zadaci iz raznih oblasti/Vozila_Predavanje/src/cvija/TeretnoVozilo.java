package cvija;

public class TeretnoVozilo extends Vozilo {

	private double teret;

	public TeretnoVozilo(double tezina, double teret) {
		super(tezina);
		this.teret = teret;
	}
	
	public char vrstaVozila() {
		return 'T';
	}

	public double getTezina() {
		return super.getTezina() + teret;
	}

	public String toString() {
		return super.toString() + ", teret: " + teret;
	}

}
