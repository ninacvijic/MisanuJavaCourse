package cvijic.nina;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		System.out.print("Unesite vrednost za c: ");
		double c = input.nextDouble();
		
		double f = (a-b) / (c + a / (c + b / (c-b)));
		double g = (a +b + Math.sin(a)) * Math.cos(c);
		
		System.out.println("Vrednost zbira funkcija f i g iznosi: " + (f + g));
		System.out.println("Vrednost razlike funkcija f i g iznosi: " + (f - g));

		input.close();

	}

}
