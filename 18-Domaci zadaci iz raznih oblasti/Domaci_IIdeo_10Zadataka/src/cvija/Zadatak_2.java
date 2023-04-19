package cvija;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite trocifren broj:");
		int broj = input.nextInt();

		int s, d, j;
		s = broj / 100;
		d = (broj / 10) % 10;
		j = broj % 10;

		System.out.println("Proizvod cifara unesenog trocifrenog broja iznosi: " + (s * d * j));
		System.out.println("Suma kubova cifara unesenog broja: " + (s * s * s + d * d * d + j * j * j));
		System.out.println("Broj koji se dobija ispisom cifara u obrnutom redosledu: " + j + d + s);

		input.close();

	}

}
