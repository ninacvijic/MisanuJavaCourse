package cvijic.nina;

import java.util.Scanner;

public class V15 {

	public static void main(String[] args) {
		
     Scanner input = new Scanner(System.in);
		
     int brojPozitivnihBrojeva = 0, brojNegativnihBrojeva = 0, brojNula = 0;
    		 
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Unesite " + i + ". broj: ");
			int broj = input.nextInt();
			
			/*
			if (broj > 0) {
				if (broj % 2 == 0) {
					paran++;
				} else {
					neparan++;
				}
			}
			// Ili
			if (broj > 0 && broj % 2 == 0) {
				paran++;
			}
			if (broj > 0 && broj % 2 != 0) {
				neparan++;
			}
			*/
			
			if (broj > 0)
			{
				brojPozitivnihBrojeva++;
			}
			else if (broj < 0)
			{
				brojNegativnihBrojeva++;
			}
			else
				if (broj == 0)
			{
				brojNula++;
			}
		}
		System.out.println("Pozitivnih brojeva ima: " + brojPozitivnihBrojeva);
		System.out.println("Negativnih brojeva ima: " + brojNegativnihBrojeva);
		System.out.println("Nula ima: " + brojNula);
		
		input.close();
	}

}
