package cvijic.nina;

import java.io.*;

public class Inc {

	public static void main(String[] args) throws Exception {
        // n- dijagonala ekrana izrazena u incima
		double n;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dijagonale ekrana izrazene u incima
		System.out.print("Unesite dijagonalu ekrana u incima: ");
		n = Double.parseDouble(ulaz.readLine());

		// Stampanje rezultata
		System.out.println("Dijagonala ekrana izrazena u centimetrima: " + n * 2.54); 
	}

}
