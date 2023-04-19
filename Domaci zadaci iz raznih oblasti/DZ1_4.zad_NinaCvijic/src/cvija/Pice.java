package cvija;

public class Pice extends Namirnica {
	
	double kolicina;   // u litrima - L
	double energetskaVred;  // energetska vrednost jednog litra - u kJ
	
	Pice(){
		
	}
	
	Pice(String ime,double kolicina,double energetskaVred){
		super(ime);
		this.kolicina=kolicina;
		this.energetskaVred =energetskaVred;
	}
	
	public double getKolicina() {
		return kolicina;
	}
	
	public double energetskaVrednost() {   //implementacija apstraktne metode
		double energetskaVrednostPica = energetskaVred * kolicina;
		return energetskaVrednostPica;
	}
	
	public String opisPica() {
   		 return super.toString() + "( " + kolicina + " L, " + energetskaVrednost() + " kJ)";
	}

}
