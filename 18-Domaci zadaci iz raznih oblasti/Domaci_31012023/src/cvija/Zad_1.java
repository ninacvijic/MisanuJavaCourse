package cvija;

import java.util.Random;

public class Zad_1 {

	// Napisati program koji će generisati i ispisati po jedan broj sledećih tipova:
	// Int, Float, Boolean, Double, Byte.

	public static void main(String[] args) {

		// random brojevi:
		
		Random rd = new Random(); // objekat

		int i = rd.nextInt();
		System.out.println("Int: " + i);

		float f = rd.nextFloat(); // 0-1
		System.out.println("Float: " + f);

		double d = rd.nextDouble(); // 0-1
		System.out.println("Double: " + d);

		boolean bln = rd.nextBoolean(); // true ili false
		System.out.println("Boolean: " + bln);

		byte[] b = new byte[7];  // niz
		rd.nextBytes(b);
		System.out.println("Byte: " + b);
	}

}
