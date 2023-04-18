package cvijic.nina;

import java.io.*;

public class TernarnaStruktura {

	public static void main(String[] args) throws Exception {
		// Deklarisanje podataka 
		double x, y; 
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podatka x
		System.out.print("Unesite vrednost za x: "); 
		x =Double.parseDouble(ulaz.readLine()); 
		
		// Primena uslovnog operatora 
		y = (x >= 0) ? x : -x;     //  ? : ternarni operator
		
		// Štampanje rezultata 
		System.out.println("Za uneto X = " + x + " dobija se Y = " + y);

	}

}
