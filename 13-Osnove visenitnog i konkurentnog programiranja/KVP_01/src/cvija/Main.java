package cvija;

public class Main {

	public static void main(String[] args) {
		
		// Prilikom pokretanja Java programa, jedna programska nit odmah pocinje da se izvrsava.
		// To je glavna ili inicijalna nit.
		
		// Upravljanje glavnom niti radi se preko objekta tipa Thread, i to pozivom metode
		// currentThread() koja pripada klasi Thread.
		
		Thread t = Thread.currentThread(); // t je proizvoljan naziv, t je objekat tipa Thread
		
		System.out.println("Trenutna nit: " + t);
		
		// [ime niti, prioritet, ime grupe kojoj pripada nit]  // ---> ispis u Consoli
		// Podrazumevano ime glavne niti je main. Njen prioritet je 5 , sto je
		// takodje podrazumevana vrednost(po defaultu).
		// (treci parametar) ispisan u Consoli, isto main, je ime grupe niti kojoj ta nit pripada,
		// grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom.
		
		// getName() - vraca ime niti  // funkcija-metoda
		System.out.println("Naziv niti: " + Thread.currentThread().getName());  // moze i t.getName(); // jer smo u t smestili ovo sto smo pisali
		                                                                         // znaci moze se i preko objekta prsitupiti, a ne celom putanjom
		// nova metoda- getPriority() - vraca prioritet niti
		System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());
	}

}
