package nina;

import java.util.Scanner;

public class Pr5a {

	public static void main(String[] args) {
		// while
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		System.out.println("Unesite vrednost za k:");
		int k = ulaz.nextInt();
		
		double s = 0;
		int i = 1;
		while (i <= n) {                                         // ili:   while (i <= n) {
			s += k * i / Math.pow((2 * i - 1), 2);               //               s += i / Math.pow((2 * i - 1), 2);
			i++;                                                 //               i++;   
		}                                                        //         }
		System.out.println("Suma s = " + s);                     //          s *= k;
		ulaz.close();
	}

}
