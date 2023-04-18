package cvijic.nina;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite znak: ");
		char znak = input.next().charAt(0);

		if (znak >= 'A' && znak <= 'Z') {
			System.out.println("Uneti znak je veliko slovo.");
		} else if (znak >= 'a' && znak <= 'z') {
			System.out.println("Uneti znak je malo slovo.");
		} else if (znak >= '0' && znak <= '9') {
			System.out.println("Uneti znak je cifra.");
		} else {
			System.out.println("Uneti znak je specijalni znak.");
		}

		input.close();
	}

}
