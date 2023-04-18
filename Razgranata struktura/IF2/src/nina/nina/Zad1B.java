package nina.nina;
import java.util.Scanner;
public class Zad1B {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);	
	int ocena;
	System.out.println("Unesite ocenu: ");
	ocena = input.nextInt();
	
	if (ocena==5)
	{
		System.out.println("Odlican.");
	}
	else if (ocena==4)
	{
		System.out.println("Vrlo dobar. ");
	}
	else if (ocena==3)
	{
		System.out.println("Dobar. ");
	}
	else if (ocena==2)
	{
		System.out.println("Dovoljan. ");
	}
	else if (ocena==1)
	{
		System.out.println("Nedovoljan. ");
	}
	else
	{
		System.out.println("Uneta ocena ne postoji. ");
	}
		
		
	input.close();
	}

}
