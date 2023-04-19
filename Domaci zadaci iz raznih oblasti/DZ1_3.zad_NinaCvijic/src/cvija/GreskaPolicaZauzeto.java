package cvija;

public class GreskaPolicaZauzeto extends GreskaPolica {  // klasa za greske - mesto je zauzeto
	
	private int ind; // indeks popunjenog mesta
	
	public GreskaPolicaZauzeto(int i) {
		ind = i;
	}
	
	public  int ind() {    //dohvatanje indeksa
		return ind;
	}
	
	public String toString() {
		return super.toString() + " Zauzeto mesto " + ind + "!";
	}

}
