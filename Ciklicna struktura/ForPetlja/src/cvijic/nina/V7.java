package cvijic.nina;

import java.util.Scanner;

public class V7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int m, n;
		System.out.println("Unesite prirodni broj m: ");
		m = input.nextInt();
		System.out.println("Unesite prirodni broj n: ");
		n = input.nextInt();

		/*// Pogresno!
		int S = 0;

		for (int k = 1; k <= m; k++) 
		{
			S = S + n * (n + k * m);
		}
		System.out.println("(I) Vrednost S iznosi: " + S);*/

		int S2 = 1;
		for (int k = 0; k <= m; k++)
		{
			S2 = S2 * (n + k * m);
			// S2 *= (n + k * m); // += -= *= /=
			// x = x + 2 // = // x += 2
		}
		System.out.println("(II) Vrednost S iznosi: " + S2);
		
		input.close();
	}

}
