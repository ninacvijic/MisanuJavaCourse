package cvija;

import java.util.Random;

public class Pitanje {
	
	// pitanje ce biti izabrano nasumicno zato radimo preko Random
	
	Random rand = new Random(); // treba da se importuje(ctrl + shift + O)
	
	Odgovori odg() {  // enum Odgovori  // a odg() je metoda ?
	
	int vrednost = (int)(rand.nextDouble() * 100);  // kastovanje!
	    // mora jer nama treba int a random vraca po defaultu double kaze prof! ?
	
	// da imamo vrednosti od 0 do 100, zato mnozimo sa 100 (random izbaci nasumicno broj od 0 do 1)lakse nam raditi 
	// 0 - 100
	
	if(vrednost < 15)           //preklapaju mi se vrednosti u petlji ?
		return Odgovori.MOZDA;  // sto ide return??
	else if (vrednost < 30)
		return Odgovori.DA;
	else if (vrednost < 60)
		return Odgovori.NE;
	else if(vrednost < 75)
		return Odgovori.KASNIJE;
	else if(vrednost < 95)
		return Odgovori.USKORO;
	else
		return Odgovori.NIKAD;
	
	}
	
	
}
