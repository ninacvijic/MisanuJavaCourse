package granula.granula;

import java.util.Scanner;

public class Vez2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite kategoriju: ");
		char kategorija = input.next().charAt(0);
		
		if (kategorija == 'A')
		{
			System.out.println("Sa kategorijom A mozete voziti Motor. ");
		}
		else if (kategorija == 'B')
		{
			System.out.println("Sa kategorijom B mozete voziti Auto. ");
		}
		else if (kategorija == 'C')
		{
			System.out.println("Sa kategorijom C mozete voziti Auto i kamion. ");
		}
		else if (kategorija == 'D')
		{
			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus. ");
		}
		else if (kategorija == 'E')
		{
			System.out.println("Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom. ");
		}
		else
		{
			System.out.println("Neispravan unos! ");
		}
		
		input.close();
	}

}
