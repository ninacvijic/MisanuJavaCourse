package cvija;

import java.util.Scanner;

public class Linear_Search_2 {
	
	// Metoda u kojoj niz nije unapred definisan-korisnik mora staviti elemente kao ulaz i odabrati 1 element da proveri njegovu lokaciju

	public static void main(String[] args) {
		
		int c, n, search, array[];

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		array = new int[n];

		System.out.println("Enter those " + n + " elements");

		for (c = 0; c < n; c++)
			array[c] = in.nextInt();

		System.out.println("Enter value to find");
		search = in.nextInt();

		for (c = 0; c < n; c++) {
			if (array[c] == search) /* Element koji se trazi je prisutan. */
			{
				System.out.println(search + " is present at location " + (c + 1) + ".");
				break;
			}
		}
		if (c == n) /* Element koji se trazi nije prisutan. */
			System.out.println(search + " isn't present in array.");

	}

}
