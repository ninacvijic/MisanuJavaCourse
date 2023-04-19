package cvija;

public class Main {

	public static void main(String[] args) {
	
		// primena funkcionalnog interfejsa i lambda izraza:
		
		NegativanBroj nb = (n) -> (n < 0);
		
		if(nb.isNegative(-3)) {   // bilo koji broj, moze i 5, itd. // bice tacan odgovor u Consoli
			System.out.println("Broj je negativan.");
		}
		else {
			System.out.println("Broj nije negativan!");
		}

	}

}
