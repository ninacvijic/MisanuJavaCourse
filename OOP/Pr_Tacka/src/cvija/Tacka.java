package cvija;

public class Tacka {
	
	private double x, y;  // dodavanje polja
	
	// dodavanje konstruktora:
	Tacka(double xx, double yy) {   //  npr pisacemo (2, 5) u Main klasi  // xx proizvoljan naziv, moglo je i npr a
		x = xx;   // moglo i this.x=x; i this.y=y;
		y = yy;
	}
	
	// postavljanje getera (geter uzima,tj dohvatice vrednost za koordinatu x).
	public double getX()
	{
		return x;
	}
	public double getY()  // geter uzima,tj dohvatice vrednost za koordinatu y
	{
		return y;
	}
	
	// metoda koja konvertuje u String- proizvoljan naziv ispisi  // mogli smo dati naziv toString
	public String ispisi() {
		return "(" + x + "," + y + ")";
	}

}
