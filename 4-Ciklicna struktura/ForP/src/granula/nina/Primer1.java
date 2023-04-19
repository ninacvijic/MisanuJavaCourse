package granula.nina;

import java.text.*;

// Suma

public class Primer1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		// Inicijalizacija promenljive s 
		double s = 0; 
		
		// Izračunavanje vrednosti sume 
		for (int n = 1; n <= 50; n++) 
			s += (n + 2.5) / (n * n + 1.2); 
		
		// Štampanje izlaznog rezultata
		System.out.println("Dobijena vrednost sume je " + df.format(s));
	}
}