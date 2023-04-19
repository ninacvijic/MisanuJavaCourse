package nina;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);
		
		int n, a;
		double eps;
		
		System.out.println("Unesite vrednost za n:");
		n = ulaz.nextInt();
		System.out.println("Unesite vrednost za a:");
		a = ulaz.nextInt();
		System.out.println("Unesite vrednost za epsilon:");
		eps = ulaz.nextDouble();
		
		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		
		while (Math.abs(x1 - x0) > eps) {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		}
		System.out.println("Dobijena vrednost je x = " + df.format(x1));
		ulaz.close();
	}

}
