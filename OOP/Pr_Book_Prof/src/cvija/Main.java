package cvija;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Ucitati Ime i broj stranica
		Scanner sc = new Scanner(System.in);

		Knjiga obj = new Knjiga();
		// obj.imeIBroj();   ima na kraju koda  // slucajno poduplali

		System.out.println("Unesite ime knjige: ");
		String unetoIme = sc.nextLine();
		System.out.println("Unesite broj stranica: ");
		int unetBr = sc.nextInt();

		obj.setime(unetoIme);
		obj.setbrojStranica(unetBr);
		obj.imeIBroj();  // poziv metode

		sc.close();
	}
}
