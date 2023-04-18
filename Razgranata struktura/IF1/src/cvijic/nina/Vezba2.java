package cvijic.nina;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x, y = 0.0;
		System.out.println("Unesite x: ");
		x = input.nextDouble();

		if (x < 0) {
			y = -5;
		} 
		else if (x >= 0 && x < 1) {
			y = x + 2;
		}
		else if (x >= 1 && x < 5) {
			y = 3 * x - 1;
		} 
		else if (x >= 5) {
			y = 2 * x;
		}
		
		System.out.println("y= " + y);
		
		input.close();
	}

}
