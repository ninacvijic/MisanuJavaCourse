package cvija;

public class A extends Thread {

	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Nit A: " + i);  // ispis brojaca
		}
		System.out.println("Kraj izvrsavanja niti A.");  // ovu poruku pisemo van for petlje
	}
}
