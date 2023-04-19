package cvija;

import java.util.Arrays;

public class Zadatak_2 {

	// Napisati program koji iz zadatog niza briše duplikate.
	// Npr.: 1232145657 -> 1234567

	public static int brisiDuplikate(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] pom = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				pom[j++] = a[i];
			}
		}
		pom[j++] = a[n - 1];

		// mijenjanje originalnog niza
		for (int i = 0; i < j; i++) {
			a[i] = pom[i];
		}
		return j;
	}

	public static void main(String[] args) {

		int a[] = { 10, 70, 30, 90, 20, 20, 30, 40, 70, 50 }; // nesortiran niz - mora se prvo sortirati
		Arrays.sort(a); // sortiranje niza-import gore
		int n = a.length;
		n = brisiDuplikate(a, n);

		// stampanje niza
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}