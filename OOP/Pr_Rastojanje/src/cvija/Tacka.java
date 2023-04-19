package cvija;

public class Tacka {
	
	double x, y;
	
	Tacka(){  //*   // ovo je ono iz teksta zadatka "podrazumevano(0,0)"
	}
	
	Tacka(double x){  //**      // ovo nismo morali ni pisati, jer se ne trazi nigde u zadatku!
		this.x = x;
	}
	
	public Tacka(double x, double y) {  //***
		this.x = x;
		this.y = y;
	}
	
	double poteg() {   // rastojanje od koordinatnog pocetka
		return Math.sqrt(x*x + y*y);
	}
	
	double Rastojanje(Tacka t) {  // Rastojanje od zadate tacke
		return Math.sqrt((Math.pow(x-t.x, 2)) + (Math.pow(y-t.y, 2)));  // !!!
	}
	

}
