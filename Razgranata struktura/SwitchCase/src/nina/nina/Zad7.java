package nina.nina;
import java.util.Scanner;
public class Zad7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); // Ctrl + Space
		int k1, k2, k3;
		System.out.println("Unesite 3 prirodna broja od 0-365: ");
		k1=input.nextInt();
		k2=input.nextInt();
		k3=input.nextInt();
		input.close();
		
		if (k1 % 7 == 0 && k2 % 7 ==0 && k3 % 7 ==0)
		{
			System.out.println("Oznacavaju iste dane u nedelji.");
		}
		else if (k1 % 7 ==1 && k2 % 7 == 1 && k3 % 7 == 1)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 7 && k2 % 7 == 7 && k3 % 7 == 7)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 8 && k2 % 7 == 8 && k3 % 7 == 8)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else if (k1 % 7 == 9 && k2 % 7 == 9 && k3 % 7 == 9)
		{
			System.out.println("Oznacavaju iste dane u nedelji. ");
		}
		else
		{System.out.println("Nisu isti dani u nedelji. ");
		
		//if ((k1 % 7 == k2 % 7) == (k1 % 7 == k3 % 7)) {
		//	System.out.println("Oznacavaju iste dane u nedelji.");
		//} else {
		//	System.out.println("Nisu isti dani u nedelji.");
		//}
	}

}
}