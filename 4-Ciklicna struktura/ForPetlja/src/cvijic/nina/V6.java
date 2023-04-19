package cvijic.nina;

import java.util.Scanner;

public class V6 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		int n, f;
		f = 1; // 1 predstavlja neutral za mnozenje
		
		System.out.println("Unesite prirodni broj: ");
		n = input.nextInt();
		
		for (int x = 1; x <= n; x++)
		{
			f = f * x;
		}
		System.out.println("Faktorijel broja " + n + " iznosi: " + f);
		
		input.close();		
	}

}
