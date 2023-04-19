package cvija;

import java.util.Scanner;

public class Zadatak_3_Test_Main {

	// Podatke o osobi čine ime, datum rođenja i adresa stanovanja.
	// Đak je osoba za koju se dodatno znaju naziv škole i razred koji pohađa.
	// Zaposlen je osoba za koju se dodatno zna naziv firme i naziv odeljenja u kome
	// radi.
	// Napisati klase koje omogućavaju unificiranu obradu podataka o nabrojanim
	// kategorijama osoba.
	// Predvideti unošenje podataka u objekte čitanjem s glavnom ulaza i
	// sastavljanjem tekstualnog opisa objekata.
	// Napisati main klasu za ispitivanje navedenih klasa.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Da li ste djak ili zaposlena osoba? Ako ste djak pritisnite broj 1, a ako ste zaposleni 2! ");
		int kategorija;
		kategorija = sc.nextInt();

		switch (kategorija) {
		case 1: {

			Zadatak_3_Djak dj = new Zadatak_3_Djak();

			System.out.println("Unesite ime: ");
			dj.ime = sc.next();
			System.out.println("Unesite datum rođenja: ");
			dj.datumRodjenja = sc.next();
			System.out.println("Unesite adresu stanovanja: ");
			dj.adresaStanovanja = sc.next();
			System.out.println("Unesite naziv skole: ");
			dj.nazivSkole = sc.next();
			System.out.println("Unesite razred: ");
			dj.razred = sc.next();
			System.out.println();

			System.out.println("<Podaci o djaku> ");
			dj.opis();

			break;
		}

		case 2: {

			Zadatak_3_Zaposleni z = new Zadatak_3_Zaposleni();

			sc.nextLine();
			System.out.println("Unesite ime: ");
			z.ime = sc.nextLine();
			System.out.println("Unesite datum rođenja: ");
			z.datumRodjenja = sc.nextLine();
			System.out.println("Unesite adresu stanovanja: ");
			z.adresaStanovanja = sc.nextLine();
			System.out.println("Unesite naziv firme: ");
			z.nazivFirme = sc.nextLine();
			System.out.println("Unesite naziv odeljenja: ");
			z.nazivOdeljenja = sc.nextLine();

			System.out.println("<Podaci o zaposlenom> ");
			z.opis();

			break;
		}

		default:
			System.out.println("Greska! Molim Vas ponovite unos.");
		}
		sc.close();

	}

}
