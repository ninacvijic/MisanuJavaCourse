package cvija;

public class Main {

	public static void main(String[] args) {
                      // try u try-u
		try {      // ugnjezdeni try catch blok-imamo unutrasnji i spoljasnji
			int a = 0;   // isprobati kad je a = 1  // i isprobati kad je a = 2
			int b = 10 / a;  // ovde je rizicna operacija  // ovde je pukao program!
			System.out.println("a = " + a);

			try {
				if (a == 1)      // ovi if uslovi cisto pokazno, da naucimo!
					a = a / (a - a);  // rizicna operacija  // hvata ga spolj.catch -- kad je a = 1, i ovde je deljenje sa 0
				if (a == 2) {
					int c[] = { 1 };
					c[10] = 100;  // rizicna operacija
				}
			} catch (ArrayIndexOutOfBoundsException e) { // unutrasnji catch blok
				System.out.println("Greska sa indeksom! ");
			}
           // tek odavde krece opet izvrsavanje programa
		} catch (ArithmeticException e) { // spoljasnji catch blok
			System.out.println("Greska prilikom deljenja! " + e);   // samo se ovo ispise u Consoli!
		}

	}

}
