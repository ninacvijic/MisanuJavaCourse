package cvija;

public class TestZivotinja {

	public static void main(String[] args) {

		Pas pas = new Pas("Meda", "labrador");  // kreiranje objekata
		Pas poznatPas = new Pas("Astor");  // podrazumevani konstruktor
		
		System.out.println(pas);
		System.out.println(poznatPas);

	}

}
