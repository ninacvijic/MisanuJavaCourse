package granula.nina;

import java.io.*;

import java.text.*;

public class Primer2 {

	// Suma IF
	
	public static void main(String[] args) throws Exception {

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		
		// Inicijalizacija promenljive s
		double s = 0; 
																					
		// Unos vrednosti promenljive n
	System.out.print("Unesite vrednost za n: "); 
	int n = Integer.parseInt(ulaz.readLine());
																					
	if(n < 100) {
		// Izračunavanje vrednosti sume
		 for (int i = 1; i<= n; i++) 
		 {
			 if (i != 3) 
				 s += (i +3.5) / (i - 3.0);
		 }																		
		// Štampanje izlalznog rezultata
		 System.out.println("Dobijena vrednost sume je " +df.format(s)); 
		 
	}
 else	
	 System.out.println("Treba da unesete vrednost za n < 100 !");
	 
	}

}
