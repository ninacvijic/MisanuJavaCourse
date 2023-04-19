package cvijic.nina;

public class Knjiga {
	
	private String naslov;
	private String autor;
	private String opis;
	private double cena;
	private boolean stanje;
	
	public Knjiga() {
		
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean isStanje() {
		return stanje;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}

	public String toString() {
		return "Knjiga: " + naslov + "\n" + "Pisac: " + autor + "\n" + "Kratak opis:" + opis + "\n" + "Cena: " + cena +"\n" + "Na stanju: "
				+ stanje;
	}
	
	
	}


