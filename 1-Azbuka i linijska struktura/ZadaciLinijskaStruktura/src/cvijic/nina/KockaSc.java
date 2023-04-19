package cvijic.nina;

import java.util.Scanner;

public class KockaSc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite stranicu kocke a: ");
		double a = input.nextDouble();

		System.out.println("Povrsina kocke je: " + 6 * a * a);
		System.out.println("Zapremina kocke je: " + a * a * a);

		input.close();
	}

}
