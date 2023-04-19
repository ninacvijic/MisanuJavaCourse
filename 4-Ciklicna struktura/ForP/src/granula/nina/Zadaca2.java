package granula.nina;

import java.text.*;

public class Zadaca2 {

	// Suma

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.###");

		double s = 0;

		for (int n = 1; n <= 50; n++)
			s += (Math.pow(-1.0, n - 1) * n / (n + 1.0));

		System.out.println("Dobijena vrednost sume je " + df.format(s));

	}

}
