package cvija;

public class BoxPrikaz {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box();
		
		// double vol;  // prof.slucajno ovo stavio, ali nam ne treba. Da smo racunali kao u proslom primeru trebalo bi nam!!!
		 
		b1.width =  10;
		b1.height = 15;
		b1.depth = 20;
		
		b2.width = 5;
		b2.height = 6;
		b2.depth = 7;
		
		// mesto za izracunavanje zapremine ( pisanje metode )  // to bismo ovde racunali da smo morali
		
		b1.volume();  // pozivanje metode
		b2.volume();

	}

}
