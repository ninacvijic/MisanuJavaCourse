package cvija;

public class KonstruktorSaParametrom {

	public static void main(String[] args) {
		
		// Konstruktor sa parametrom
		
		Circle c1 = new Circle(10); // kreiranje objekta sa parametrom 
		
		System.out.println("Povrsina kruga(Area of Circle)iznosi: " + c1.area());  //nazivObjekta.nazivMetode();
		
	}

}

// Sta ako ne navedemo konstruktor?
// Da li u konstruktoru mozemo zadati pocetnu vrednost? (ne preko parametra)
// Konstruktor sa parametrom?
