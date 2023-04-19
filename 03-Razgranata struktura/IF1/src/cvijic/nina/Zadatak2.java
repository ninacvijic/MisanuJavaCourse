package cvijic.nina;
import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {
		
		/* Za uneti broj ispitati da li je broj pozitivan, negativan ili
		 * jednak 0
		 */
		
		// 1.deo: Unos podataka (uocavanje potrebnih ulaznih podataka)
		
		Scanner sc = new Scanner(System.in);
		
		int broj;
		
		System.out.println("Unesite broj: ");
		broj = sc.nextInt();
		
		// 2.deo: Obrada podataka
		
		if (broj > 0)
		{
			System.out.println("Broj je pozitivan.");
		}
		
		if (broj<0)
		{
			System.out.println("Broj je negativan.");
		}
		
		if (broj==0)
		{
			System.out.println("Uneti broj je nula.");
		}
		
		// x = 10; // naredba dodele
		// x == 10; // ili npr x == y; // naredba ispitivanja jednakosti  // logicki operator
			
		sc.close();
	}

}
