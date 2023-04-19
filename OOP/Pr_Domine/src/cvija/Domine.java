package cvija;

public class Domine {
	
	private int a, b;
	
	// konstruktor:  // izaberemo kakav cemo, na osnovu toga sto se trazi u zadatku
	Domine(int aa, int bb) {  // konstruktor sa parametrima primitivnog tipa
		a = aa;
		b = bb;
	}

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public Domine okreni() {   // Domine su mi tip podataka-novo!!!
		int p = a;   // p = pomocna promenljiva
		a=b;
		b=p;
		return this;  // moramo nesto vratiti jer nije void
		              // vracamo samo this, to je trenutno stanje
	}
	
	public boolean ista(Domine d) {   // boolean!!!  // klasa sa obj d mi je parametar!
		return a == d.a && b == d.b || b == d.a && a == d.b;  // uslov da budu jednake bez obzira na redosled!
	}
	
	public String tekstualniOpis() {  // mogli i naziv public String toString
		return "(" + a + ", " + b + ")"; 
	}
	
}