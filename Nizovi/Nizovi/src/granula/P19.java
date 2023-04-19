package granula;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();
		
		double x[] = new double[n];
		double y[] = new double[n];
		
		System.out.println("Unesite članove niza x:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextDouble();
		}
		
		System.out.println("Unesite članove niza y:");
		for (int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "] = ");
			y[i] = ulaz.nextDouble();
		}
		
		double f;
		for (int i = 0; i < x.length; i++) {
			f = (x[i] + y[i]) * (x[i] - y[i]);
			
			System.out.println("Za " + x[i] + " i " + y[i] + " dobija se f = " + f);
		}
		
		ulaz.close();
	}

}
