package cvijic;

// Klasa, Objekat, Objekat.Metoda - prosli Primer

public class DemoVerzija {

	public static void main(String[] args) {
		
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();
		Rastojanje r3 = new Rastojanje();
		
		r1.stopala = 14;
		r1.inci = 9.5;
		
		r2.stopala = 19;
		r2.inci = 5.5;
		
		// objekat.podatak
		System.out.println("Rastojanje 1: " + r1.stopala + "\'-" + r1.inci + "\"");
		System.out.println("Rastojanje 2: " + r2.stopala + "\'-" + r2.inci + "\"");
		
		System.out.println("Rastojanje 3: " + r3.stopala + "\'-" + r3.inci + "\"");
	}

}
