package cvija;

public class Main {

	public static void main(String[] args) {
		
		finallyBlockWithException fbwe = new finallyBlockWithException(); // objekat pomocne klase
		
		try {
			fbwe.procA();  // poziv metode
		} catch (Exception e) {   // uopsteni exception, ne znamo koji je ovde, cisto pokazno!  // ovde se hvata baceni izuzetak iz pom.klase!!!
			System.out.println("Exception caught");
		}
		fbwe.procB();   // poziv      // jedino se za metodu A pravi try catch block, a za B i C ne,
		fbwe.procC();   // metoda      // jer je u njoj bacen izuzetak, pa ga sad moramo uhvatiti!
	}

}


