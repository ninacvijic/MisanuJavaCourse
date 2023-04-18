package cvijic.nina;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");

		System.out.print("Unesite visinu osobe: ");
		double visina = input.nextDouble();
		System.out.println("Unesite masu osobe: ");
		double masa = input.nextDouble();

		System.out.println("Indeks telesne mase BMI = " + df.format(masa / Math.pow(visina,2)));

		input.close();

	}

}
