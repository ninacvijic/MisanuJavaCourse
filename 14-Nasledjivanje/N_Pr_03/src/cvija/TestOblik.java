package cvija;

public class TestOblik {

	public static void main(String[] args) {

		//kreiranje objekata klasa
		Krug krug = new Krug();
		Pravougaonik pravougaonik = new Pravougaonik();
		Zvezda zvezda = new Zvezda();
		
		// pozivanje metoda
		krug.crtaj();
		pravougaonik.crtaj();
		zvezda.crtaj();
		
		// II nacin:
		
	/*	public class TestOblik {

	    public static void main(String[] args) {
		Krug krug = new Krug(); 
		Pravougaonik pravougaonik = new Pravougaonik(); 
		Zvezda zvezda = new Zvezda();
		
		crtajOblik(krug); 
		crtajOblik(pravougaonik); 
		crtajOblik(zvezda);
		} 
	    
	    static void crtajOblik(Oblik o) { 
	    	o.crtaj(); 
	    	}
	    } */

	}

}
