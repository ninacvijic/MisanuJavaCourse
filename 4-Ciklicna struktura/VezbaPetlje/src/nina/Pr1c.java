package nina;

import java.io.*;

public class Pr1c {

	public static void main(String[] args) throws Exception {
		// do-while
		double suma = 0;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		int i = 1;
		do {
			suma += (double) i / (i + 1);  // je isto sto i: suma = suma + (double) i / (i + 1);
			i++;
		} while (i <= n);
		System.out.println("Dobijena vrednost sume je " + suma);
	}

}
