package cvijic.nina;

import static java.lang.Math.*;   // ovo je prakticnije, pogotovo ako ima vise matematickih formula sa npr abs, pow, sqrt, itd // importuje se cela matematicka biblioteka!
//import static java.lang.Math.sqrt;  // to bi se odnosilo samo na funkciju sqrt
// obavezno je da bude static !!! inace ne radi

public class Main {

	public static void main(String[] args) {

		double a = 3.0, b = 4.0;

		double c = sqrt(a * a + b * b);  // kad smo gore uradili import sada ovde ne pisemo Math.sqrt, vec samo sqrt !!!

		System.out.println(" C = " + c);

	}

}
