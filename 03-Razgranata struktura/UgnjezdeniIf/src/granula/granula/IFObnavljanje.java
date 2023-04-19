package granula.granula;

import java.util.Scanner;

public class IFObnavljanje {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();

		if (/* uslov */ broj > 0) // uslov pisemo logickim operatorima
		{
			System.out.println("Uneti broj je pozitivan! ");
		} 
		else if (broj < 0) 
		{
			System.out.println("Uneti broj je negativan! ");
		} 
		else
		{
			System.out.println("Unet je broj (cifra) 0. ");
		}

		sc.close();
	}
}
