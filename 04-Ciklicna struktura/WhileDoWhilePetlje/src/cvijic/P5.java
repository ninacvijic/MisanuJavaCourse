package cvijic;

import java.util.Scanner;

public class P5 {

	// Brojevi deljivi sa a

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		int a, n, i = 1;
		
		System.out.println("Unesite vrednost za n:");
		n = ulaz.nextInt();
		System.out.println("Unesite vrednost za a:");
		a = ulaz.nextInt();
		
		while (i <= n) {
			if (i % a == 0)
				System.out.println(i);
			i++;
		}
		ulaz.close();
	}

}
