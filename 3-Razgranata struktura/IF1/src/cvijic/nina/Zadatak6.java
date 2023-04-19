package cvijic.nina;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int b;
		System.out.println("Unesite broj bodova: ");
		b = input.nextInt();

		if (b >= 0 && b <= 49) {
			System.out.println("Ocena je 1");
		}
		else if (b >= 50 && b <= 60) {
			System.out.println("Ocena je 2");
		}
		else if (b >= 61 && b <= 69) {
			System.out.println("Ocena je 3");
		} 
		else if (b >= 70 && b <= 80) {
			System.out.println("Ocena je 4");
		} 
		else if (b >= 81 && b <= 100) {
			System.out.println("Ocena je 5");
		}
		else {
			System.out.println("Greska");
		}

		input.close();

	}

}
