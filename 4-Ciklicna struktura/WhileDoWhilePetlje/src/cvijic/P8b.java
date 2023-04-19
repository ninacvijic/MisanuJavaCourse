package cvijic;

public class P8b {

	public static void main(String[] args) {

		boolean provera = true;
		double x0 = 18.0, x1 = 0.0; 
		
		// Ciklična struktura 
		while (provera) { 
			x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0; 
		    provera = Math.abs(x1 - x0) > 1.0E-5; 
		    x0 = x1; 
		    } 
		
		// Štampanje rezultata
		System.out.println("Dobijena vrednost je x = " + x1);
	}

}
