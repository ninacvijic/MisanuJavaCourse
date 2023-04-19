package cvijic;

import java.util.Scanner;

public class P12b {
	
	// while

	public static void main(String[] args) {
		
      Scanner ulaz = new Scanner(System.in);
		
		int n, k;
		double s = 0;
		
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		
		int i = 0;
		while (i <= n) {
			s = s + 2 / (double) (k + i);
			++i;
		}
		
		System.out.println("Suma je " + s);
		ulaz.close();
	}

}
