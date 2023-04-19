package cvija;

import java.text.DecimalFormat;

public class Zadatak_4 {

	public static void main(String[] args) {

		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("\tR.BR.\tx\ta\ty\tz");

		for (double x = 1.0; x <= 4.0; x += 1.0)
			for (double a = 0.1; a <= 0.5; a += 0.1)
				for (double y = 0.5; y >= 0.2; y -= 0.05) {
					double z = ((x + a + y) / (x - y)) * ((x + a + y) / (x - y)) - x / (x + a);
					i++;

					System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(a) + "\t" + df.format(y) + "\t"
							+ df.format(z));
				}

	}

}
