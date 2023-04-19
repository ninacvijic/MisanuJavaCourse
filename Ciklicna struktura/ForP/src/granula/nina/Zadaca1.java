package granula.nina;

import java.text.*;
import java.util.Scanner;

public class Zadaca1 {

	// Proizvod

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();

		double p = 1;

		for (int i = 1; i <= n; i++) {
			p *= (1 - 1 / (i + 1.0));
		}
		System.out.println("Dobijena vrednost proizvoda je " + df.format(p));

		input.close();
	}
}
