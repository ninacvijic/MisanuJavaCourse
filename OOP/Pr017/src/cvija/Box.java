package cvija;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	Box()  {    // konstruktor
		width = 10;   // dodeljivanje pocetnih vrednosti  // inicijalizacija
		height = 10;
		depth = 10;
	}
	
	double volume()  {   // imam return jer nije void!!!  // nemam parametre metode () 
		return width * height * depth;
	}

}
   
// *Podsecanje*
//   Konstruktor:
// - Isto ime kao Klasa.
// - Konsturuktor ne vraca vrednost.
// - Konstruktor je javna "metoda".
// - Konstruktor moze (ne mora) da ima parametre.