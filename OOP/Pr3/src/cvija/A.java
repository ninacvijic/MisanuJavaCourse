package cvija;

public class A {
	
	private String message;  // podatak message koji opisuje klasu A

	// Deklarisanjem privatnih podataka vrsi se enkapsulacija - skrivanje podataka
	// Sprecava se promena vrednosti promenljivih iz koda van zadate klase
	
	// podatak = atribut = osobina klase
	// Objekti imaju svoje atribute
	// atributi se predstavljaju preko promenljivih u deklaraciji klase
	// deklarisu se unutar klase van svih metoda
	
	// Metode klase:
	
	// Metoda setMessage postavlja poruku.
	public void setMessage(String msg) // metoda je public, da bi se omogucilo pristup podacima
	// void znaci da ne vracaju rezultat, kao parametar imaju promenljivu istog tipa kao podatak koji postavljaju
	{
		message = msg; // postavlja vrednost promenljivoj message
	}
	
	// Metoda getMessage() vraca poruku.
	public String getMessage() // nema parametara, vracaju odgovarajuci tip podataka
	{                          // da smo stavili npr private umesto public program bi javio gresku jer smo sakrili to od ostalih klasa i one ne mogu koristiti tu metodu
		return message;
	}
	
	/*
	 * Parametri i argumenti metoda
	 * Promenljiva deklarisana u zaglavlju metode nazivamo parametrom.
	 * Argument se prosledjuje metodi prilikom poziva metode.
	 * !!! Prilikom poziva, parametri dobijaju vrednosti argumenta metode.
	 */
	
}
