package cvijic.nina;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	    double x, y = 0.0;
		System.out.println("Unesite x: ");
		x = input.nextDouble();

		if (x < 0) {
			y = -1;
		} 
		else if (x == 0) {
			y = 0;
		}
		else if (x > 0) {
			y = 1;
		}
		System.out.println("y je: " + y);

		input.close();
	}

}
