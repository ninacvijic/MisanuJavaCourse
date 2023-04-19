package cvija;

public class IndeksException  extends Exception {  // klasa za greske-nedozvoljen indeks u veriznom razlomku
	
	private int n, i;  // red razlomka i nedozvoljeni indeks
	
	public IndeksException(int n, int i) {  //inicijalizacija
		this.n = n;
		this.i = i;
	}

	public int red() {  //dohvatanje polja
		return n;
	}
	public int ind() {  //dohvatanje polja
		return i;
	}
	
	@Override
	public String toString() {  // tekstualni opis
		return "GRESKA: Nedozvoljen indeks " + i + " u veriznom razlomku reda " + n;
	}
}
