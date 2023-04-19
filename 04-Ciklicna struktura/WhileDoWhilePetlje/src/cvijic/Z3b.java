package cvijic;

import java.text.*;

public class Z3b {

	// while

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");

		double y;
		int i = 0;

		System.out.println("\tR.BR.\tX\tY(X)");

		double x = 1.0;
		while (x <= 5.0) {
			y = x - 0.8 * x * x;

			i++;

			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));

			x += 0.5;
		}

	}

}
