package nina.nina;
import java.util.Scanner;
public class Zad4A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int kvadrant;
		System.out.println("Unesite broj kvadranta: ");
		kvadrant = input.nextInt();
		
		switch(kvadrant)
		{
		case 4:
		{
			System.out.println("Od 270 do 360 stepeni. ");
			break;
		}
		case 3:
		{
			System.out.println("Od 180 do 270 stepeni. ");
			break;
		}
		case 2:
		{
			System.out.println("Od 90 do 180 stepeni. ");
			break;
		}
		case 1:
		{
			System.out.println("Od 0 do 90 stepeni. ");
			break;
		}
		default:
			System.out.println("Pogresan unos. ");
		}
		
		input.close();
	}

}
