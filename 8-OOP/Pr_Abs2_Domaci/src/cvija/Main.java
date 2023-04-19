package cvija;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

			Abs a = new Abs();

			System.out.print("Unesite broj: ");
			double unetiBroj = scanner.nextDouble();
			
			System.out.println("Aposolutna vrednost unesenog broja je: ");
			a.setBroj(unetiBroj);
			System.out.println(a.getBroj());
		
			scanner.close();

	}

}
