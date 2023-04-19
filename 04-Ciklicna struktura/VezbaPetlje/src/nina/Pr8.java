package nina;

import java.util.Scanner;

public class Pr8 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		
		int p = 1, s = 0;
		
		int i = 1;
		while (i <= 3 * n) {
			p *= i;
			
			if (i % 3 == 0)
				s += p;
			
			i++;
		}
		
		System.out.println("Suma s = " + s);
		ulaz.close();
	}

}
