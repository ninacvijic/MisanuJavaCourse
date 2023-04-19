package nina.nina;
import java.util.Scanner;
public class Zad1A {

	public static void main(String[] args) {
		
		
		
		// 1.deo:  Unos podataka
		// 2.deo: Obrada podataka
		// 3.deo: Stampanje podataka
		
		//1.deo
		Scanner input = new Scanner(System.in);
		int ocena;
		System.out.println("Unesite ocenu: ");
		ocena = input.nextInt();
		
		//  switch (uslov)
		// {
		// case 1: {
		//obrada
		// break;
		//}
		//case 2:
		//{
		//obrada
		//break;
		//}
		//default:
		//obrada ostalih slucajeva
		//}
		
		switch(ocena)
		{
		case 5:
		{
			System.out.println("Odlican. ");
			break;
		}
		case 4:
		{
			System.out.println("Vrlo dobar. ");
			break;
		}
		case 3:
		{
			System.out.println("Dobar. ");
			break;
		}
		case 2:
		{
			System.out.println("Dovoljan. ");
			break;
		}
		case 1:
		{
			System.out.println("Nedovoljan. ");
			break;
		}
		default:
			System.out.println("Uneta ocena ne postoji. ");
		}
		
		input.close();
	}

}
