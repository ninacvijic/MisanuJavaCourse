package cvijic;

public class P8a {

	public static void main(String[] args) {

		double x0 = 18.0;
		double x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0; 
		
		// Ciklična struktura 
		while (Math.abs(x1 - x0) > 1.0E-5) { 
			x0 = x1;
			x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0;
			} 
		
	// Štampanje rezultata 
		System.out.println("Dobijena vrednost je x = " + x1);
	}

}
