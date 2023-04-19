package nina;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pr1a {

	public static void main(String[] args) throws Exception {
// for
		double suma = 0;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1; i <= n; i++)
			suma += (double) i / (i + 1);
		System.out.println("Dobijena vrednost sume je " + suma);
	}

}
