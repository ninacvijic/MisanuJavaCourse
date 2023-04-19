package cvija;

// sleep(vrednostUMilisekundama) // da usporimo izvrsenje Threada

public class A extends Thread{
	
	public void run() {
		int i = 1;
		while(i <= 10) {
			System.out.println("i: " + i);  // ispis brojaca
			
			try {    // kliknula na crveno i klik na Surrounded try catch pa mi automatski ovo izbacilo!!!
				Thread.sleep(100);   // mijenjati npr 500, pa 1000 da vidim koliko vise vremena treba kad je veci broj
			} catch (InterruptedException e) {
				// e.printStackTrace();  // ovo zakomentarisala i ono TOPO izbrisala
				System.out.println("Nit je prekinuta."); // dopisali ovo cisto pokazno  // sto mi se nije ispisalo u Consoli???
			}
			i++;  // ovo na samom kraju pisemo!
		}
	}
}
	
	// metoda sleep(milisekunde) - privremeno zaustavlja(suspenduje) izvrsavanje niti
	// argument metode sleep() je interval u milisekundama
	
	// Metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedException
	// Desice se izuzetak ukoliko neka druga nit pozeli da prekine ovu suspendovanu nit.
