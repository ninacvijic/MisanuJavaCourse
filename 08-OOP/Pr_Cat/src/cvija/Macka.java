package cvija;
// Zadatak:
// Kreirati klasu Cat(Macka).
// Klasa ima atribut ime, i metodu za prikazivanje imena. 
// Sa glavnog ulaza omoguciti unos imena.  // putem Scannera - unos na Consoli

public class Macka {

	String ime;  // atribut, tj podatak koji opisuje klasu

	public void prikazatiIme() {   // metoda
		System.out.println("Ime: " + this.ime);  // moglo je i bez kljucne reci this!
	}

}
