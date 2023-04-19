package cvija;

/*
 • Испит садржи шифру испита од највише 6 знакова и оцену. Може да се дохвати шифра испита и оцена и да се испит испише на главном излазу у 
облику "шифра:оцена".
 */

public class Ispit {
	
		  private String sif;
		  private Ocena oce;

		  public Ispit (String sif, Ocena oce) {
		    this.sif = sif;
		    this.oce = oce;
		  }

		  public String sifra () { 
			  return sif; 
			  }

		  public Ocena ocena () { 
			  return oce; 
			  }

		  public void pisi () { 
			  System.out.print(sif + ":"); 
			  oce.pisi(); 
			  }
		}


