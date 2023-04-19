package cvija;

public class Main {

	public static void main(String[] args) {
	
		Matrica m1 = new Matrica(3,2);
		
		System.out.println("Broj vrsta matrice: " + m1.getRows());
		System.out.println("Broj kolona matrice: " + m1.getCols());

		m1.setElement(0, 0, 0.5);
		m1.setElement(0, 1, 8.3);
		m1.setElement(1, 0, 0.4);
		m1.setElement(1, 1, 5.0);
		m1.setElement(2, 0, 7.4);
		m1.setElement(2, 1, 4.7);
		
		System.out.println("Element sa indeksom [1][0] matrice je: " + m1.getElement(1, 0));
		System.out.println("Element sa indeksom [2][1] je: " + m1.getElement(2,1));
	
		
		
	}
}

