package cvija;

public class InicObjSaParametrizovanimKonstruktoromPrikaz {

	public static void main(String[] args) {

		Box b1 = new Box(10, 15, 20);
		Box b2 = new Box(5, 6, 7);
		
	//	System.out.println(b1.width);  // ovako ne vidi ovo polje jer je private!!!  // zato radim na ovaj nacin zadatak!

		System.out.println("Zapremina: " + b1.volume());
		System.out.println("Zapremina: " + b2.volume());

	}

}
