package cvija;

public class Zadatak_3_Osoba {

	String ime; // atributi
	String datumRodjenja;
	String adresaStanovanja;
	
	public Zadatak_3_Osoba() {  // konstruktor- podrazumevani
		
	}
	
	public void opis() {
		System.out.println("Ime:  " + ime + "\nDatum rođenja: " + datumRodjenja
				+ "\nAdresa stanovanja: " + adresaStanovanja);
	}

}
