package cvija;

public class B extends Thread {
	
	public void run() {  // ovu metodu run() je obavezno dodati! 
		for(int i = 1; i <=15; i++) {
			System.out.println("Nit B: " + i); // i je brojac
		}
		System.out.println("Kraj izvrsavanja niti B.");
	}

}
