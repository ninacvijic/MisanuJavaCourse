package granula.granula;

import java.util.Scanner;

public class Vez3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite kategoriju: ");
		char kategorija = input.next().charAt(0);

		input.close();
		
		switch (kategorija)
		{
		case 'A':
		{
			System.out.println("Sa kategorijom A mozete voziti Motor. ");
			break;
		}
		case 'B':
		{
			System.out.println("Sa kategorijom B mozete voziti Auto. ");
			break;
		}
		case 'C': 
		{
			System.out.println("Sa kategorijom C mozete voziti Auto i kamion. ");
			break;
		}
		case 'D': 
		{
			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus. ");
			break;
		}
		case 'E':
		{
			System.out.println("Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom. ");
			break;
		}
		default:
		{
			System.out.println("Neispravan unos! ");
		}
	}
		
	}
}

