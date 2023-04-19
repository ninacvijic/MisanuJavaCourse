package cvija;

import java.util.Random;

public class Zad_2 {

	// Napisati program koji generiše i ispisuje pet slučajna broja celobrojnog
	// tipa.

	public static void main(String[] args) {

		Random rd = new Random();

		System.out.println("Pet slucajnih brojeva int tipa: ");

		for (int i = 0; i < 5; i++)
			System.out.println(rd.nextInt());

	}

}
