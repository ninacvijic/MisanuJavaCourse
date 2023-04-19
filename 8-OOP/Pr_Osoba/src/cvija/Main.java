package cvija;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Osoba o1 = new Osoba();

		System.out.println("Unesite ime: ");
		o1.ime = sc.nextLine();

		System.out.println("Unesite datum rodjenja: ");
		o1.datumRodjenja = sc.nextLine();

		System.out.println("Unesite adresu: ");
		o1.adresaStanovanja = sc.nextLine();
		
		System.out.println(o1.ispisi());

		sc.close();
	}

}
