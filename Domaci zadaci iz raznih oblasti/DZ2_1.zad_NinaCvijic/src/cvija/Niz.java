package cvija;

/*
  • Низ зарубљених купа може да садржи задати број (подразумевано 5) купа. Низ се ствара празан, после чега се купе могу додавати иза последњег 
попуњеног места, док се низ не напуни (ако се низ препуни, програм се прекида). Може да се дохвата капацитет низа, број попуњених места и може 
да се испита да ли је низ попуњен до краја. Купе садржане у низу могу да се дохватају и да се проналази индекс купе најмање запремине.
 */

public class Niz {
	
	  private int kapacitet, duzina;
	  private ZarubljenaKupa[] kupe;
	  
	  public Niz(int k) {
	    kupe = new ZarubljenaKupa[k];
	    kapacitet = k;
	    duzina = 0;
	  }
	  
	  public Niz() {
	    this(5);
	  }
	  
	  public Niz(Niz niz) {
	    kapacitet = niz.kapacitet;
	    duzina = niz.duzina;
	    kupe = new ZarubljenaKupa[kapacitet];
	    for (int i = 0; i < duzina; i++) {
	      kupe[i] = new ZarubljenaKupa(niz.kupe[i].getR1(), niz.kupe[i].getR2(), niz.kupe[i].getH());
	    }
	  }
	  
	  public void dodaj(ZarubljenaKupa k) {
	    if (duzina == kapacitet) {
	      System.exit(1);
	    }
	    kupe[duzina++] = k;
	  }
	  
	  public int getKapacitet() { 
		  return kapacitet;
	}
	  
	  public int getBrPopunjenihMesta() { 
		  return duzina;
	 }
	  
	  public boolean isNizPopunjenDoKraja() {
		return duzina == kapacitet;
	}
	  
	  public ZarubljenaKupa get(int i) {
	    if (i < 0 || i >= duzina) {
	      System.exit(2);
	    }
	    return kupe[i];
	  }
	  
	  public void set(int i, ZarubljenaKupa k) {
	        if (i < 0 || i >= duzina) {
	            System.exit(2);
	        }
	        kupe[i] = k;
	    }
	  
	  public int getIndeksKupeMinV() {
	    if (duzina == 0) {
	      return -1;
	    }
	    ZarubljenaKupa min = kupe[0];
	    int imin = 0;
	    for (int i = 0; i < duzina; i++) {
	      if (kupe[i].manjeOd(min)) {
	        min = kupe[i];
	        imin = i;
	      }
	    }
	    return imin;
	  }
	}


