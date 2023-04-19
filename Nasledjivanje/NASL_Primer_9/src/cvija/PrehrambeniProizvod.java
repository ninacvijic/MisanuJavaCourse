package cvija;

public class PrehrambeniProizvod extends Proizvod {
	
	String vrsta;
	
	public PrehrambeniProizvod(String naziv, String proizvodjac, double cena, String rokTrajanja) { 
		super(naziv, proizvodjac, cena, rokTrajanja);
		
		vrsta = "nepoznata";
	}
	
	public void ispisi() {
		System.out.println("Naziv: " + naziv);
		System.out.println("Proizvodjac: " + proizvodjac);
		System.out.println("Cena: " + cena);
		System.out.println("Rok trajanja: " + rokTrajanja);
		System.out.println("Vrsta: " + vrsta);
	}

}
