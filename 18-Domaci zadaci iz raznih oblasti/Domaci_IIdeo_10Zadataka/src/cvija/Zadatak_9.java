package cvija;

import java.io.*;

public class Zadatak_9 {

	public static void main(String[] args) throws Exception {
		double[]f = new double [100];
		double[] g = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite g[0]: ");
		 g[0] = Double.parseDouble(ulaz.readLine());
		
		System.out.println("Unesite f[0]: ");
		f[0] = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite broj n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		for(int i = 1; i <= n; i++) {
			g[i + 1] = i * i * f[i] + 2 * g[i];
			f[i + 1] = f[i] * g[i] + 3 * i - 1;
		}

		System.out.println("F(" + n + ") = " + f[n]);
	}

}
