package cvija;

public class Valjak {

	private double r, h;

	Valjak(double rr, double hh) {
		r = rr;
		h = hh;
	}

	Valjak() {
		r = 1;
		h = 1;
	}

	public double r() {
		return r;
	}

	public double h() {
		return h;
	}

	public double V() {
		return r * r * Math.PI * h;
	}

	public String toString() {
		return "(" + r + "," + h + ")";
	}
}
