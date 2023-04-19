package cvija;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_1 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double a, b, c, f, g, zbir, razlika;

		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za c: ");
		c = Double.parseDouble(ulaz.readLine());

		f = (a - b) / (c + a / (c + b / (c - b)));

		g = (a + b + Math.sin(a)) * Math.cos(c);

		zbir = f + g;
		razlika = f - g;

		System.out.println("Zbir funkcija f i g iznosi: " + zbir);
		System.out.println("Razlika funkcija f i g iznosi: " + razlika);

	}

}
