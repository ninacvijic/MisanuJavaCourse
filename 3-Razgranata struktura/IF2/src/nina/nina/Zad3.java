package nina.nina;
import java.util.Scanner;
public class Zad3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		char slovo;
		System.out.println("Unesite karakter: ");
		slovo = input.next().charAt(0);
		
		switch(slovo)
		{
		case 'a': case 'A':
		{
			System.out.println("Samoglasnik. ");
			break;
		}
		case 'e':
		{
			System.out.println("Samoglasnik. ");
			break;
		}
		case 'E':
		{
			System.out.println("Samoglasnik. ");
			break;
		}
		case 'i': case 'I':
		{
			System.out.println("Samoglasnik. ");
			break;
		}
		case 'o': case 'O':
		{
			System.out.println("Samoglasnik. ");
			break;
		}
		case 'u' & 'U':
		{
			System.out.println("Samoglasnik. ");
			break;
		}
		default:
			System.out.println("Suglasnik. ");
		}
		input.close();
	}

}
