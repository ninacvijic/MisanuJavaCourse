package granula.nina;

public class Primer13 {

	// Armstrongovi brojevi
	
	public static void main(String[] args) {
		
        // m - trocifreni broj
		// s - cifra stotice broja
		// d - cifra desetice broja
		// j - cifra jedinice broja
		
		int m, s, d, j;
		
		System.out.println("Armstrongovi brojevi od 100 do 999 su: "); 
		
		for (s = 1; s <= 9; s++) 
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) { 
					
					// Traženje Armstrongovog broja
					m = 100 * s + 10 * d + j; 
					if (m == Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3)) 
						System.out.println(m); 
				}
		
		// 2.nacin preko izdvajanja cifara  !!!
		
		// int s, d, j;
		//  System.out.println("Armstrongovi brojevi od 100 do 999 su: ");
		// for (int n = 100; n<= 999; n++) {
		// s = n /100;
		// d = (n % 100) / 10;
		// j = n % 10;
		//  if( n == Math.pow(s,3) + Math.pow(d, 3) + Math.pow(j,3))
		// System.out.println(n);
		// }
		// }   }
	}

}
