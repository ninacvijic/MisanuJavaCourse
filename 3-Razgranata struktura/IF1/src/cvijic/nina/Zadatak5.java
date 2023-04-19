package cvijic.nina;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		// broj - pozitivan, negativan, ili nula

		Scanner input = new Scanner(System.in);

		int x;
		System.out.println("Unesite broj x: ");
		x = input.nextInt();

		if (x > 0) {
			System.out.println("Broj x je pozitivan !");
		} 
		else if (x < 0) {
			System.out.println("Broj x je negativan.");
		} 
		else if (x == 0) {
			System.out.println("Uneti broj x je nula.");
		} 
		else {
			System.out.println("Pogresan unos!");
		}
		input.close();
	}

}
