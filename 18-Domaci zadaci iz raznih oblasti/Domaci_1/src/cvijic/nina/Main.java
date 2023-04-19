package cvijic.nina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		double br = sc.nextDouble();
		
		NegBroj nb = (num) -> (num < 0);
		
		if(nb.isNegative(br)) {
			System.out.println("Broj je negativan.");
		}
		else {
			System.out.println("Uneti broj nije negativan!");
		}
		
		sc.close();

	}

}
