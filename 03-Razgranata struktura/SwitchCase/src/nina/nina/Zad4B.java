package nina.nina;
import java.util.Scanner;
public class Zad4B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int kvadrant;
		System.out.println("Unesite broj kvadranta: ");
		kvadrant = input.nextInt();
		
		if (kvadrant== 4)
		{
			System.out.println("Od 270 do 360 stepeni. ");
		}
		else if (kvadrant==3)
		{
			System.out.println("Od 180 do 270 stepeni. ");
		}
		else if (kvadrant==2)
		{
			System.out.println("Od 90 do 180 stepeni. ");
		}
		else if (kvadrant==1)
		{
			System.out.println("Od 0 do 90 stepeni. ");
		}
		else
		{
			System.out.println("Pogresan unos. ");
		}
		
		input.close();
	}

}
