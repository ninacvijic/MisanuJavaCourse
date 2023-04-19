package cvija;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		int brPokusaja = 0;

		int trazeniBroj = rand.nextInt(10);

		int broj = 0;
		boolean pogodak = false;

		while (pogodak == false) {

			System.out.println("Unesite broj: ");
			broj = sc.nextInt();
			brPokusaja++;

			if (broj == trazeniBroj) {
				pogodak = true;
			} else if (broj < trazeniBroj) {
				System.out.println("Trazeni broj je manji od unetog broja !");
			} else if (broj > trazeniBroj) {
				System.out.println("Trazeni broj je veci od unetog broja !");
			}

		}

		System.out.println("Pogodili ste trazeni broj. To je broj: " + broj + ". " + "Pogodili ste iz " + brPokusaja + " pokusaja.");
		sc.close();
	}

}
