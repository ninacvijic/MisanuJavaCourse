package cvijic.nina;

import java.io.*;
import java.text.DecimalFormat;

public class Funkcijamaxmin {

	public static void main(String[] args) throws Exception {
		
		// Deklarisanje podataka
		
		double x, y, f;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka
		
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Double.parseDouble(ulaz.readLine());
		
		// Razgranata struktura
		
		if (x > y)
			f = Math.sqrt((x - 0.2) / (2 + y));
		else
			f = Math.sqrt((y - 0.2) / (2 + x));
		
		// Štampanje rezultata
		
		System.out.println("Vrednost funkcije je " + df.format(f));
	}
}