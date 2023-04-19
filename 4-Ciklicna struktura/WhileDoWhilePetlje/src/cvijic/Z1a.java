package cvijic;

import java.util.Scanner;

public class Z1a {

	// while
	
	public static void main(String[] args) {
		
   Scanner input = new Scanner(System.in);
   int n;
   double s = 0;
   
   System.out.println("Unesite vrednost za n: ");
   n = input.nextInt();
   
   int i = 1;
   while(i <= n) {
	   if (i % 2 == 0) {
		   s = s + i;
	   }
	   i++;
   }
   System.out.println("Suma parnih brojeva iznosi: " + s);
   
   input.close();
	}

}
