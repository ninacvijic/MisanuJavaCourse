package cvija;

public class Main {

	public static void main(String[] args) {
		//Nabrajanje je vrsta klase. Nema sve osobine klase!
		//Instanca klasa ne pravi se pomocu kljucne reci new!
		//Enum, odnosno rezervisana rec Enum definise klasu.
		//Svaka konstanta, odnosno identifikator, definisana u nabrajanju je 
		//zapravo objekat ciji tip je to isto nabrajanje.
		// npr Crvena je tip Boja * 
		
		Boja b;//nismo koristili
		
		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo()); //naziv enuma.boja koju zelimo.get metoda za udeo
		
		System.out.println("Sve boje: ");
		for(Boja c : Boja.values())// for petljom cemo proci kroz sve boje  // ovde nismo pre toga kreirali niz! //*novo*
         System.out.println(c + " " + c.getUdeo()); // obratiti paznju na ispis, ne moze String jer je Sop
	}

}
