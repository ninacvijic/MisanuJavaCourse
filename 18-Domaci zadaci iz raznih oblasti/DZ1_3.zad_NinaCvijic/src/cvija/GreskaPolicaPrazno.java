package cvija;

public class GreskaPolicaPrazno extends GreskaPolica {  // klasa za greske - mesto je prazno
	
	private int ind; //indeks praznog mesta
	
	public GreskaPolicaPrazno(int i) {
		ind = i;
	}
	
	public int ind() {   //dohvatanje indeksa
		return ind;
	}
	
	public String toString() {
		return super.toString() + " Prazno mesto " + ind + "!";
	}

}
