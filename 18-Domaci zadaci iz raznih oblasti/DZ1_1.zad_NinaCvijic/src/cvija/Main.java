package cvija;

import java.util.Scanner;

public class Main {  // ispitivanje klase realnih vektora

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Unesite opseg indeksa prvog vektora: ");
				int min = sc.nextInt();
				int max = sc.nextInt();
				
				if(min==0 && max==0)
					break;
				
				Vektor v1 = new Vektor(min, max);
				System.out.println("Unesite komponente prvog vektora: ");
				for(int i = min; i<=max; v1.postavi(i++, sc.nextDouble()));
				
				System.out.println("Unesite opseg indeksa drugog vektora: ");
				min = sc.nextInt();
				max = sc.nextInt();
				if(min==0 && max==0)
					break;
				
				Vektor v2 = new Vektor(min, max);
				System.out.println("Unesite komponente drugog vektora: ");
				for(int i = min; i<=max; v2.postavi(i++, sc.nextDouble()));
				
				System.out.println("Skalarni proizvod = " + Vektor.skalProiz(v1, v2) + "\n");
	
			} catch (VektorException e) {
				System.out.println(e + "\n");
			} catch (OutOfMemoryError e) {
			     System.out.println("*** Dodela memorije nije uspela! \n");
			}
		}
		

	}

}
