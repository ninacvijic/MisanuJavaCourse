package cvija;

public class Zivotinja {

	private String vrsta;  // privatni podatak

	public Zivotinja() {   // podrazumevani konstruktor
	}

	public Zivotinja(String vrsta) {   // parametrizovani konstruktor
		this.vrsta = new String(vrsta);  // dodeljuje vrstu u vrsta // *novo*
	}

	public String toString() {    // toString metoda
		return "Ovo je " + vrsta;
}
	
}
