package cvija;

public class Zadatak_3_Djak extends Zadatak_3_Osoba {

	String nazivSkole; // dodatna polja
	String razred;
	
	public Zadatak_3_Djak() {
		super();  // nasledjivanje
	}

	public void opis() { // metoda - za tekstualni opis
		super.opis(); // nasledjeno
		System.out.println("Naziv skole: " + this.nazivSkole + "\nRazred: " + this.razred);
	}

}
