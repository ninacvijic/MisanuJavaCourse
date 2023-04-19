package cvija;

import predmeti.Predmet;  // import klase iz drugog paketa!!!

public class GreskaPolicaTezina extends GreskaPolica {  // klasa za greske - prekoracena je nosivost police
	
	private Predmet p;  // preteski predmet
	
	public GreskaPolicaTezina(Predmet pp) {  // inicijalizacija
		p = pp;
	}
	
	public Predmet predmet() {  // dohvatanje predmeta
		return p;
	}
	
	public String toString() {
		return super.toString() + "Prevelika tezina " + p.Q() + "!";
	}

}
