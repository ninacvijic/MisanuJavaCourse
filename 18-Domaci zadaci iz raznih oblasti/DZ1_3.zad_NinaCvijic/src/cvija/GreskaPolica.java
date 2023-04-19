package cvija;

public abstract class GreskaPolica extends Exception {  // apstraktna klasa za greske pri radu sa policama
	
	public String toString() {
		return "*** GRESKA  s policom: ";  // tekstualni opis
	}

}
