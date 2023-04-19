package cvija;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x, y = 0.0;

		System.out.println("Unesite x: ");
		x = sc.nextDouble();

		if (x < 5) {
			y = (x - 3) * (x - 3);
		} else if (x >= 5 && x < 8) {
			y = x + 2;
		} else if (x >= 8) {
			y = x - 1;
		}

		System.out.println("Funkcija y(x) iznosi: " + y);
		sc.close();

	}

}
