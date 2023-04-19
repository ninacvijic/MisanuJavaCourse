package p2;
//Drugi nacin: (Kucanjem) Importovanjem paketa.

import p1.*; //  import paket.*; // importuju se sve klase iz navedenog paketa
// import p1.First;  //  import paket.nazivKlase; // importuje se samo zadana klasa iz navedenog paketa

public class ImportovanjePaketa {

	public static void main(String[] args) {
		First f = new First();
		f.view();

	}

}
