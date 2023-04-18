package cvijic.nina;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double x,y;
		System.out.println("Unesite x: ");
		x = input.nextDouble();

		if (x > -2 && x <= 2) {
			y = 2 * x;
		} 
		else if (x >= 5 && x < 7) {
			y = 3 * x - 1;
		} 
		else {
		    y = 1 / x;
		}
		System.out.println("y je: " + y);

		input.close();
	}

}
