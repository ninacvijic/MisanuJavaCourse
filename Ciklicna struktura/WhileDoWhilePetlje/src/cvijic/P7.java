package cvijic;

import java.util.Scanner;

public class P7 {

	// Suma brojeva cija je cifra jedinica 8
	
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		int n, i = 1, s = 0;
		
		System.out.println("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		
		while (i <= n) {
			if (i % 10 == 8)
				s += i;
			i++;
		}
		
		System.out.println("Suma je " + s);
		ulaz.close();
	}

}
