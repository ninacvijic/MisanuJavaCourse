package cvija;

public class Box {
	
	private double width;  // 3 privatna polja-atributa (podatka klase)
	private double height;
	private double depth;
	
	Box() {  // prvi konstruktor, bez parametara, sa inicijalizovanim vrednostima
		width = 1;
		height = 1;
		depth = 1;
	}
	
	Box(double w, double h, double d) {  // 2.konstr., sa 3 parametra
		width = w;
		height = h;
		depth = d;
	}
	
	Box(double len) {    // 3.konst., ima 1 parametar-primitivni tip podataka double, tj pocetnu vrednost koja je dodeljena svim atributima
		width = height = depth = len;
	}
	
	Box(Box b) {   // 4.konstruktor, ima 1 parametar-slozeni tip podataka klasu, b je objekat klase Box  // ovde pozivamo objekat
		width = b.width;
		height = b.height;
		depth = b.depth;
	}
	
	double volume() {  // metoda
		return width * height * depth;
	}
	

}
