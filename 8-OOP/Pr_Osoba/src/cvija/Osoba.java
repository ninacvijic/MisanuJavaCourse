package cvija;

public class Osoba {
	
	public String ime, datumRodjenja, adresaStanovanja;
	
	// ocekuje se sada konstruktor   // nismo ga navodili
	// ukoliko ne navedemo konstruktor, pozvace se "default-ni" konstruktor
	
	public String ispisi()
	{
		return "Ime: " + ime + "\n" + "Datum rodjenja: " + datumRodjenja + "\n" + "Adresa: " + adresaStanovanja + "\n" ;
	}

}
