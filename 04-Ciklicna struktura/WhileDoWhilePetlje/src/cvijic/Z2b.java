package cvijic;

import java.util.Scanner;

public class Z2b {

	// while
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		double s = 0;
		
		System.out.println("Unesite vrednost za n: ");
		n = input.nextInt();
		
		int i = 1;
		while(i <= n) {
			s += 1.0 / (double)(Math.pow(3 * i, 2));
			i++;
		}
		
     System.out.println("Vrednost sume iznosi: " + s);
     input.close();  
	}

}
