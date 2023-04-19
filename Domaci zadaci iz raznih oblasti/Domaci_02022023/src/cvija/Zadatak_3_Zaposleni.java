package cvija;

public class Zadatak_3_Zaposleni extends Zadatak_3_Osoba {

	String nazivFirme; // dodatna polja
	String nazivOdeljenja;

	// konstruktor
	public Zadatak_3_Zaposleni() {
		super(); // nasledjeno iz klase Osoba
	}

	public void opis() {
		super.opis(); // opis nasledjen iz klase Osoba
		System.out.println("Naziv firme: " + this.nazivFirme + "\nNaziv odeljenja: " + this.nazivOdeljenja);
	}

}
