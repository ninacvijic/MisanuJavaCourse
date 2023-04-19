package cvijic.nina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Deklaracija stringova
		
		// "dasdas@@23asdfsASDASDa#%$&*"
		
		String prezime;  // deklaracija stringa
		String izraz = "Andrija";  // Inicijalizacija stringa
		System.out.println(izraz);  // Ispisivanje vrednosti stringa
		
		
		// Ucitavanje (i smestanje unete) vrednosti sa konzole

		Scanner sc = new Scanner(System.in);
	
			System.out.println("Koliko imate godina? ");
			int brojGodina = sc.nextInt();
			System.out.println("Imate godina: " + brojGodina);
			
			System.out.println("Kako se zovete? ");
			String ime = sc.next();
			System.out.println("Vi se zovete: " + ime);
		
		sc.close();
	}

}
