package cvija;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Abs a = new Abs();

		System.out.print("Unesite broj: ");
		a.broj = scanner.nextDouble();
		
		System.out.println("Aposolutna vrednost unesenog broja je: " + a.apsolutnaVrednost());
	
		scanner.close();

	}

}
