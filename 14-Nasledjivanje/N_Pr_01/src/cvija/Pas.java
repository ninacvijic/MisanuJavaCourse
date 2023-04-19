package cvija;

public class Pas extends Zivotinja{
	
	private String ime; 
	private String rasa; 
	
	public Pas(String ime) { 
		super("pas");       // poziv konstruktora bazne klase Zivotinja
		this.ime = ime; 
		rasa = "bernardinac"; // po dafaultu, ako se nista ne navede
		} 
	
	public Pas(String ime, String rasa) { 
		super("pas"); 
		this.ime = ime; 
		this.rasa = rasa;
		} 
	
	public String toString() { 
		return super.toString() + " " + ime + ", " + rasa + ".";
	}    // prvo se poziva istoimena nasledjena metoda, a zatim se dodaju i preostale informacije

}
