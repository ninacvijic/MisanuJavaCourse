package nina.nina;
import java.util.Scanner;
public class Zad2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int dan;
		System.out.println("Unesite redni broj dana u sedmici: ");
		dan = input.nextInt();

		switch(dan)
		{
		case 7:
		{
			System.out.println("Nedelja. ");
			break;
		}
		case 6:
		{
			System.out.println("Subota. ");
			break;
		}
		case 5:
		{
			System.out.println("Petak. ");
			break;
		}
		case 4:
		{
			System.out.println("Cetvrtak. ");
			break;
		}
		case 3:
		{
			System.out.println("Sreda. ");
			break;
		}
		case 2:
		{
			System.out.println("Utorak. ");
			break;
		}
		case 1:
		{
			System.out.println("Ponedeljak. ");
			break;
		}
		default:
			System.out.println("Uneti redni broj dana u sedmici ne postoji. ");
		}
			
		input.close();
	}

}
