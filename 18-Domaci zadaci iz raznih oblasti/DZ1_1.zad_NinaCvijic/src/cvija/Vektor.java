package cvija;

/*
 1. Napisati klasu vektora realnih brojeva sa zadatim opsezima indeksa i tom prilikom predvideti> 
- stvaranje vektora s opsegom indeksa od zadate donje do zadate gornje granice, od 1 do zadate gornje 
   granice i od 1 do 10. 
- postavljanje I dohvatanje vrednosti komponente sa zadatim indeksom, 
- izračunavanje skalarnog proizvoda dva vektora
- dohvatanje graničnih vrednosti indeksa. 
U main klasi ispitati kreirane klase.
*/

public class Vektor {   // klasa vektora realnih brojeva
	
	int min, max;  // granice indeksa
	double[] niz; // niz komponenata
	                                                        // inicijalizacija:
	public Vektor(int mi, int ma) throws VektorException {  //-zadati opseg
		if(mi > ma) throw new VektorException(VektorException.OPSEG);
		niz = new double [(max=ma) - (min=mi) + 1];
	}
	
	public Vektor(int ma) throws VektorException {    //-zadata gornja granica
		this(1, ma);
	}
	
	public Vektor() throws VektorException {   // -podrazumevani opseg
		this(1, 10);
	}
	
	public Vektor postavi(int i, double b) throws VektorException {   // postavljanje komponente
		if(i<min || i>max) throw new VektorException(VektorException.INDEKS);
		niz[i-min] = b;
		return this;
	}
	
	public double dohvati(int i) throws VektorException {  // dohvatanje komponente
		if(i<min || i>max) throw new VektorException(VektorException.INDEKS);
		return niz[i-min];
	}
	
	public static double skalProiz(Vektor v1, Vektor v2) throws VektorException {  // skalarni proizvod
		if(v1.niz.length != v2.niz.length) throw new VektorException(VektorException.DUZINA);
		double s = 0;
		for(int i = 0; i<v1.niz.length; s+= v1.niz[i]*v2.niz[i++]);
		return s;
	} 
	
	public int minInd() {  //dohvatanje najmanjeg indeksa
		return min;
	}
	
	public int maxInd() {  //dohvatanje najveceg indeksa
		return max;
	}

}
