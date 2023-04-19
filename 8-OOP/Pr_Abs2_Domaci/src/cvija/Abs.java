package cvija;

public class Abs {

	private double broj;

	public void setBroj(double br) {
		broj = br;
	}

	public double getBroj() {
		if (broj < 0)
			return -1 * broj;
		else if (broj > 0)
			return broj;
		else
			return 0;
	}

}
