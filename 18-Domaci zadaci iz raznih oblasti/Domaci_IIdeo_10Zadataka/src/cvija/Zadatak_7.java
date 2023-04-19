package cvija;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_7 {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 

		int[] a = new int[100];
		int[] b = new int[100];

		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1; i <= 2*n; i++) {
			System.out.print("a = "); 
			a[i] = Integer.parseInt(ulaz.readLine());
			}

		for (int i = 1; i <= 2*n; i++) {
		    b[i] = (a[i] + a[2*n + 1 - i]) / 2;
		}
		
		System.out.print("Niz A: " );
		for (int i = 1; i <= 2*n; i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\nNiz B: ");
		for (int i = 1; i <= n; i++)
			System.out.print(b[i] + " ");
		
	}

}
