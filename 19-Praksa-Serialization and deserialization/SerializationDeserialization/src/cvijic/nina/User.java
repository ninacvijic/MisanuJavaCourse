package cvijic.nina;

import java.io.Serializable;

public class User implements Serializable { // da objekat ucinimo serijalizacijskim implementiramo Serializable interfejs

	private static final long serialVersionUID =  129348938L;  
	
	String ime;
	String password;
	transient String email;
	static int g;
	
	public User(String ime, String password, String email, int g) {  
		this.ime = ime;
		this.password = password;
		this.email = email;
		User.g = g;
	}

	public String toString() {
		return "Korisnik: " + ime + "\n"
				+ "Lozinka korisnika: " + password + "\n"
				+ "Email korisnika: " + email + "\n"
				+ "Godine korisnika: " + g;
	}
	
}

	/*
	 * Napomene:
	 * 1. Ako je roditeljska klasa implementirala interfejs koji se moze serijalizovati, onda ga dijete klasa ne mora implementirati.
	 * 2. Samo non static podaci se serijalizuju.
	 * 3. Static podaci i "transient"(prolazni) podaci se ne serijalizuju.
	 *    (transient-bice inicijalizovani zadanom vrijednoscu tokom deserijalizacije(npr.za objekte je null, za int je 0))
	 *    (static-bice ucitani sa trenutnom vrijednoscu definisanom u klasi tokom deserijalizacije)
	 * 4. SerialVersionUID(serijalizacijsko vrijeme izvodjenja)-je jedinstvena verzija ID-a za klasu koja je serijalizovana.
	 *    (koristi se tokom deserijalizacije da se provjeri da li posiljatelj i primatelj serijalizovanog objekta imaju ucitane
	 *    klase za taj objekat koje su kompatibilne s obzirom na serijalizaciju, u suprotnom ce doci do InvalidClassException-a)
	 * Serijalizovana klasa moze eksplicitno deklarisati svoj vlastiti ID deklarisanjem imena polja. Mora biti static, final i long tipa.
	 */





