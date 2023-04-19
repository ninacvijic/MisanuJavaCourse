package cvijic;

import java.text.DecimalFormat;

public class Z3a {

	// for
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");

		double y;
		int i = 0;

		System.out.println("\tR.BR.\tX\tY(X)");

		for(double x = 1.0; x <= 5.0; x += 0.5) {
			y = x - 0.8 * x * x;

			i++;

			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
		}

	}

}
