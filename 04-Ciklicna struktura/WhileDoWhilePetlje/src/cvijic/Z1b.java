package cvijic;

import java.util.Scanner;

public class Z1b {
	
	// do-while

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		   int n;
		   double s = 0;
		   
		   System.out.println("Unesite vrednost za n: ");
		   n = input.nextInt();
		   
		   int i = 1;
		   do {
			   if (i % 2 == 0) {
				   s = s + i;
			   }
			   i++;
		   } while(i <= n);
		   
		   System.out.println("Suma parnih brojeva iznosi: " + s);
		   
		   input.close();
	}

}
