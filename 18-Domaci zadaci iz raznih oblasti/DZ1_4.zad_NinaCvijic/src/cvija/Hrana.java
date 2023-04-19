package cvija;

public class Hrana extends Namirnica {
	
	double ukupnaTezina;
	double udeoBel;
	double udeoMasti;
	double udeoUH;
	
	Hrana(){
		
	}
	
	Hrana(String ime,double ukupnaTezina){
		super(ime);
		this.ukupnaTezina=ukupnaTezina;
	}

	public double getUkupnaTezina() {
		return ukupnaTezina;
	}

	public double getUdeoBel() {
		udeoBel = 1670;
		return udeoBel;
	}

	public double getUdeoMasti() {
		udeoMasti = 3760;
		return udeoMasti;
	}

	public double getUdeoUH() {
		udeoUH = 1720;
		return udeoUH;
	}
	
      public double energetskaVrednost() {   //implementacija apstraktne metode
		
		double ukUdeo = ukupnaTezina * ( (getUdeoBel()/100) + (getUdeoMasti()/100) + (getUdeoUH()/100) );
		
		double provera = (getUdeoBel()/100) + (getUdeoMasti()/100) + (getUdeoUH()/100);
		
		if(provera>100) {
			System.out.println("Greska! Zbir udela belančevina, masti i ugljenih hidrata prelazi 100% !");
		}
		return ukUdeo;
	}

    public void tekstualniOpis() {
	System.out.println(super.toString()+ "( " + ukupnaTezina + " gr , " + energetskaVrednost()+ " kJ) ");
}

    
}
