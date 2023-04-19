package cvija;

import java.util.Scanner;

public class MainMacka {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Macka macka = new Macka();  // kreiranje objekta

		System.out.print("Unesite ime macke: ");
		macka.ime = scanner.nextLine();    // nazivobj.nazivpodatka

		macka.prikazatiIme();  // nazivobj.nazivmetode();
		
		scanner.close();
	}

}
