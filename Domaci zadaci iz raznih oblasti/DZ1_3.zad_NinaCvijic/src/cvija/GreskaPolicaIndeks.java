package cvija;

public class GreskaPolicaIndeks extends GreskaPolica {  // klasa za greske - nedozvoljen indeks
	
	private int ind; //nedozvoljeni indeks
	
	public GreskaPolicaIndeks(int i) {
		ind = i;               //inicijalizacija
	}
	
	public int ind() {   //dohvatanje indeksa
		return ind;
	}
	
	public String toString() {
		return super.toString() + "Nedozvoljen indeks " + ind + "!";
		}

}
