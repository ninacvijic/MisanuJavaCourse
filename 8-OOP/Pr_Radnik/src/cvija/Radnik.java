package cvija;

public class Radnik {
	
	private String ime;
	private double procenat;
	private double prihod;
	
	// konstruktor:
	Radnik(String ime, double procenat, double prihod) {
		this.ime = ime;     // da pokazemo malo i sa this!
		this.procenat = procenat;
		this.prihod = prihod;
	}
	
	public double prihod() {  // kaze ovo get za prihod, ali preko metode??
		return prihod;
	}
	
	public double plata() {
		return prihod() * procenat / 100;  // metoda unutar metode
	}
	
	public String opis() {    // konvertovanje u string
		return ime + "/" + plata();     // pozivam metodu i u opisu
	}
	
 	public void drugiOpis() {
 		System.out.println(ime + "/" + plata());  // 2.nacin, nije neophodno!!!
 	}

}
