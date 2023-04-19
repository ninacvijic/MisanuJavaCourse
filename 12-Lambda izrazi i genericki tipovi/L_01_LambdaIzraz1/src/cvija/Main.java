package cvija;

public class Main {

	public static void main(String[] args) {
		
		// () -> 123.45 // najjednostavniji primer
	    // double nekaMetoda() {return 123.45;} // ovako smo ranije radili


		// levaStranaLambdaIzraza -> desnaStranaLambdaIzraza

		// TestiraBroj paranBroj = /* ovde dolazi lambda izraz */;
		TestiraBroj paranBroj = (n) -> (n % 2) == 0;  // nazivInterfacea zatim proizvoljan nazivPromenljive = lambda izraz koji koristimo za resenje zadatka i ;
                                                      // u interfaceu smo uzeli n, zato ga sad i ovde pisemo, mora biti ista oznaka!
		if (paranBroj.test(10)) { // poziv metode test iz interfejsa // proizvoljan broj izaberemo
			System.out.println("Broj je paran.");  // ako stavimo npr br 5 u zagradu umesto 10, odg u Consoli ce biti da nije paran!
		} else {
			System.out.println("Broj nije paran!");
		}

	}
}