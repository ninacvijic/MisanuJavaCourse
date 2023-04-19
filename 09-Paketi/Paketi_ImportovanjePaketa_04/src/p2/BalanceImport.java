package p2;

import p1.*; // *

public class BalanceImport {

	public static void main(String[] args) {

		Balance ob = new Balance("Nils", 234.56);  // kreiranje novog objekta // cisto da pokaze da se objekt moze kreirati standardno ovako i kao niz
		ob.show();

		Balance current[] = new Balance[3]; // niz objekata

		current[0] = new Balance("Mika", 123.45);  // ovo su sve novi objekti
		current[1] = new Balance("Zika", 345.12);
		current[2] = new Balance("Ljubivoje", -12.34);

		for (int i = 0; i < 3; i++) {
			current[i].show();
		}

	}

}
