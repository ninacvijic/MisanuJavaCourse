package cvijic.nina;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

		System.out.println("Unesite vrednost promenljive x: ");

		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();

		System.out.println("Vrednost funkcije y je: " + Math.sqrt((Math.exp(x / 2) + 1.2 * Math.sin(2 * x)) / (3.3 * Math.cos(x) + 7.1 * Math.exp(x))));

		input.close();

	}

}
