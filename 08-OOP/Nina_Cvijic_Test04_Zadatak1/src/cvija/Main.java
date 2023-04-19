package cvija;

import cvijic.nina.*;

public class Main {

	public static void main(String[] args) {
		
		Knjiga k = new Knjiga();
		
		k.setNaslov("Na Drini Cuprija");
		System.out.println("Dohvati naslov: " + k.getNaslov());
		k.setAutor("Ivo Andric");
		System.out.println("Dohvati pisca: " + k.getAutor());
		k.setOpis(" Roman pripoveda o gradjenju mosta preko Drine u bosanskom mestu Visegrad.");
		System.out.println("Dohvati opis: " + k.getOpis());
		k.setCena(1100.0);
		System.out.println("Dohvati cenu: " + k.getCena());
		k.setStanje(true);
		System.out.println("Dohvati stanje: " + k.isStanje());
		
		System.out.println();
		
		System.out.println("Sve o knjizi: \n" + k.toString());
	}

}
