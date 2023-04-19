package cvija;

public class PreklapanjeKonstruktoraPrikaz {

	public static void main(String[] args) {
		
		Box b1 = new Box();  // objekat bez parametara
		
		Box b2 = new Box(10, 15, 20);  // obj ima 3 argumenta
		
		Box b3 = new Box(10);  // obj ima 1 argument
		
		Box b4 = new Box(b2);  // obj ima objekat klase za argument!!!
		
		System.out.println("Zapremina: " + b1.volume());
		System.out.println("Zapremina: " + b2.volume());
		System.out.println("Zapremina: " + b3.volume());
		System.out.println("Zapremina: " + b4.volume());
		
	}

}
