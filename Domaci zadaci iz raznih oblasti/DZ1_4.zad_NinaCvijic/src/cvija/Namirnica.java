package cvija;

public abstract class Namirnica extends Energent {
	
	String ime;
	int identif = (int)(Math.random()*100);
	
	Namirnica(){
		
	}
	
	Namirnica(String ime){
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public int getIdentifikator() {
		return identif;
	}
	
	public String toString() {
    return ime+"[ "+identif+" ]";
	}

}
