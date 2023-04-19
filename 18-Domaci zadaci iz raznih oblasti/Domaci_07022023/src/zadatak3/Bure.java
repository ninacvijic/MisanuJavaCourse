package zadatak3;

public class Bure extends Teret { // bure je teret oblika valjka

	private int r, h; // podaci: poluprecnik i visina

	Bure() {

	}

	public Bure(double tezina, int r, int h) {
		super(tezina);
		this.r = r;
		this.h = h;
	}

	public char oznakaVrste() { // oznaka vrste je B
		return 'B';
	}

	public int V() {
		return (int) (Math.PI * r * r * h); // kastovanje
	}

}
