package nina.nina;
import java.util.Scanner;
public class Zad6C {

	public static void main(String[] args) {

		// +, -, *, /  ----> znak
		// LOperand, DOperand
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite jedan od znakova: +, -, *, /");
		char znak = sc.next().charAt(0);
		System.out.println("Unesite dva realna broja: ");
		double prviBroj = sc.nextDouble();
		double drugiBroj = sc.nextDouble();
		double rezultat;
		
		switch (znak)
		{
		case '+':
		{
			rezultat = prviBroj + drugiBroj;
			System.out.println("Zbir brojeva iznosi: " + rezultat);
			break;
		}
		case '-':
		{
			rezultat = prviBroj - drugiBroj;
			System.out.println("Razlika iznosi: " + rezultat);
			break;
		}
		case '*':
		{
			rezultat = prviBroj * drugiBroj;
			System.out.println("Proizvod iznosi: " + rezultat);
			break;
		}
		case '/':
		{
			rezultat = prviBroj / drugiBroj;
			System.out.println("Kolicnik brojeva iznosi: " + rezultat);
			break;
		}
		default:
			System.out.println("Pogresan unos!");
		}
		
	sc.close();	
	
	}

}
