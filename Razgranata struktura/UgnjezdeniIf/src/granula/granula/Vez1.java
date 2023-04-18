package granula.granula;

import java.util.Scanner;

public class Vez1 {

	public static void main(String[] args) {
		
		// 1.deo algoritma: Unos podataka
		// 2.deo algoritma: Obrada podataka
		// 3.deo algoritma: Ispisivanje vrednosti
		
	// 1.deo algoritma	Unos podataka
		
Scanner input = new Scanner (System.in);

int najveciBroj;

System.out.println("Unesite prvi broj: ");
int br1 = input.nextInt();

System.out.println("Unesite drugi broj: ");
int br2 = input.nextInt();

System.out.println("Unesite treci broj: ");
int br3 = input.nextInt();

// 2.deo Obrada podataka

// 5, 2, 10

if(br1 > br2)  // (br1 > br2) == true
{
	if(br1 > br3)  // (br1 > br3) == true
	{
	najveciBroj = br1;
}
	else
	{
		najveciBroj = br3;
	}
	}
else 
{
if (br2 > br3)	
{
	najveciBroj = br2;
}
else
{
	najveciBroj = br3;
}
	}

// 3.deo: Ispisivanje vrednosti

System.out.println("Najveci od unetih brojeva je: " + najveciBroj);

input.close();

}

}