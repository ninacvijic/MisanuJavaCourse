package cvija;

public class Krug extends Oblik {

	double poluprecnik;

	public Krug(double r) { // konstruktor
		poluprecnik = r;
	}

	public double uzmiPovrsinu() { 
		povrsina = Math.PI * (poluprecnik * poluprecnik); // ovo povrsina je atribut iz apstr.klase
		return povrsina; 
	}
	

}
