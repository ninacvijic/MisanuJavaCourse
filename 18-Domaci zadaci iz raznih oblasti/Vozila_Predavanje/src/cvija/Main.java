package cvija;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite nosivost mosta: ");
		double nosivost = sc.nextDouble();
		
		System.out.println("Unesite tezinu vozila:");
		double tezina = sc.nextDouble();
		
		System.out.println("Unesite T ili P za vrstu vozila?");
		char oznaka = sc.next().charAt(0);

		switch(oznaka) {
		case 't': case 'T':
			
			System.out.println("Unesite tezinu tereta:");
			double teret = sc.nextDouble();
			
			TeretnoVozilo tv = new TeretnoVozilo(tezina, teret);
			
			if(nosivost < tv.getTezina()) {
				System.out.println("Most nece izdrzati ovo vozilo!");
			}
			else {
				System.out.println("Vozilo moze preci preko mosta bezbedno.");
			}
			break;
			
		case 'p': case 'P':	
			
			System.out.println("Unesite broj putnika: ");
			int brPutnika = sc.nextInt();
			System.out.println("Unesite prosecnu tezinu putnika");
			double prosecnaTezinaPutnika  = sc.nextDouble();
			
			PutnickoVozilo pv = new PutnickoVozilo(tezina, brPutnika, prosecnaTezinaPutnika);
			
			if(nosivost < pv.getTezina()) {
				System.out.println("Most nece izdrzati ovo vozilo!");
			}
			else {
				System.out.println("Vozilo moze preci preko mosta bezbedno.");
			}
			break;
			
		default:
			System.out.println("Pogresan unos. Morate uneti P za putnicko ili T za teretno vozilo!");
			
		}
		
		sc.close();
	}

}
