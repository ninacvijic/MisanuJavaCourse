package cvija;

public class TestPravougaonik {

	public static void main(String[] args) {
		
		 // Kreiranje objekta klase Pravougaonik
		Pravougaonik p = new Pravougaonik(3.2, 4.1); 
		
		// Štampanje rezultata 
		System.out.println("Obim pravougaonika je " + p.obim());
		System.out.println("Površina pravougaonika je " + p.povrsina()); 

	}

}
