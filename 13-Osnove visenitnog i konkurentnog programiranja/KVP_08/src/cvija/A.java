package cvija;

public class A implements Runnable {  // drzimo ispod implements mis i klik na prvo ponudjeno i ispise nam dole kostur metode

	String ime; // ime niti // polje
	Thread t;  // sta je ovo???
                       
	A(String name) { // konstruktor  // A je nova nit // konstruktor sluzi da kreira unutar klase nas objekat
		ime = name;
		t = new Thread(this, ime);  // ?  // ovako pravimo novu nit, this je ono sto je poznato, a novo je ime
		t.start();           // ?  // mozemo vec odmah ovde pokrenuti
	}
	
	public void run() {
		
		try {
		for(int i = 1; i <= 5; i++) {
			System.out.println(ime + " = " + i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
		}
		
	}
}
