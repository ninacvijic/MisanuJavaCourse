package cvija;

public class Izuzetak extends Throwable {
	
	private double broj;
	
	public Izuzetak (double n) {
		broj = n;
	}
	
	public String toString() {
		return "Kvadratni koren broja " + broj + " ne moze se izracunati.";
	}
	
	

}
