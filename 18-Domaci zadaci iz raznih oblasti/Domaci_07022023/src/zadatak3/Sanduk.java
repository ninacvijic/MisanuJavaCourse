package zadatak3;

public class Sanduk extends Teret { // Sanduk je Teret oblika kvadra

	private int a, b, c; // podaci:ivice kvadra

	Sanduk() { // podraz.konstruktor

	}

	Sanduk(double tezina, int a, int b, int c) { // parametriz.konstr.
		super(tezina); // ovo nasledjuje
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public char oznakaVrste() { // oznaka vrste je S iz postavke zadatka
		return 'S'; // implem.apst.metode iz Teret
	}

	public int V() { // implemen.druge aspstr.metode iz Teret
		return a * b * c;
	}

}
