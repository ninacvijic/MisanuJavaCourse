package cvija;

public class Valjak {
	
	private double r, h;
	
	Valjak(double rr, double hh) {  // konstruktor
		r = rr;  // ovo znaci da je r dobio vrednost iz parametra rr !!!
		h = hh;  // inicijalizacija
	}
	
	Valjak() {  // drugi konstruktor
		r = 1;  // inicijalizacija na jedinicu
		h = 1;
	}
	
	public double getR() {
		return r;
	}
	
	public double getH() {
		return h;
	}
	
	public double V() {
		return r*r*3.14*h;
	}
	
	public double P() {
		return 2*r*3.14*(r+h);
	}
	
	public String opis() {                // moglo i: public void opis() {
		return "[" + r + "," + h + "]";               // System.out.println("[" + r + "," + h + "]"); }
	}

}
