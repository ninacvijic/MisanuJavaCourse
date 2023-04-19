package cvija;

public class Zad_4 {

	// Napisati program koji računa broj parnih i neparnih brojeva u nizu.

	public static void main(String[] args) {

		int[] a = { 1, 5, 4, 10, 18, 7, 23 }; // niz

		int p = 0; // brojac parnih brojeva
		int n = 0; // brojac neparnih

		for (int i : a)
			if (i % 2 == 0)
				p++;

			else
				n++;

		System.out.println("Broj parnih brojeva u nizu je: " + p);
		System.out.println("Broj neparnih brojeva u nizu je: " + n);

	}

}
