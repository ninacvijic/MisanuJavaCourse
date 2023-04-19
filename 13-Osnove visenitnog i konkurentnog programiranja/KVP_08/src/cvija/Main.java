package cvija;

public class Main {

	public static void main(String[] args) {
		
		// nove metode:
		//isAlive() - utvrdjuje da li se nit jos izvrsava
		//join() - ceka da se druga nit zavrsi
		
		A a1 = new A("Prva nit"); // pravimo objekat
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());  // odgovor true ili false

		A a2 = new A("Druga nit");
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
		
		A a3 = new A("Treca nit"); 
		System.out.println("Treca nit se izvrsava: " + a3.t.isAlive());
		
		try {     // ?
			a1.t.join();
			a2.t.join();
			a3.t.join();
		}catch(Exception e) {
		}

	System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());  // opet ponovimo metodu, ali jer smo je stavili na cekanje sad je false odgovor!
	System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
	System.out.println("Treca nit se izvrsava: " + a3.t.isAlive());

}
}