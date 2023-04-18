package cvijic.nina;

import java.io.*;

public class OdsecciTrougao {

	public static void main(String[] args) throws Exception {

		// Deklarisanje odsecaka
		
		double a, b, c;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
        // Unos podataka
		
		System.out.print("Unesite dužinu odsečka a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite dužinu odsečka b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite dužinu odsečka c: ");
		c = Double.parseDouble(ulaz.readLine());
		
        // Razgranata struktura
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
			
			// Stampanje rezultata
			System.out.println("Površina trougla je " + p);
		}
	}

}
