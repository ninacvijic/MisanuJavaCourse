package cvijic;

import java.util.Scanner;

public class P10a {

	// DO-WHILE

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		int n;
		double s = 0;
		
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		
		int i = 1;
		do {
			s += 1 / (double) (2 * i);
			i++;
		} while (i <= n);
		
		System.out.println("n = " + n + " s = " + s);
		ulaz.close();
	}

}
