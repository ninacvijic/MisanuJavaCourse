package cvija;

public class FunkcijaExit {

	// Program koristi funkciju Exit

	public static void test()  // staticka metoda
	{
		int a = 10;   // dodjela vrijednosti nekoj promenljivoj a
		System.out.println("BBB");   // ispis vrednosti-poruke, tj stringa

		if (a == 10)    // ako je 10, a jeste, pozivamo funkciju exit
		{
			System.exit(0); // vrsi terminaciju vrednosti
		}
		System.out.println("CCC");
	}

	public static void main(String[] args) {

		System.out.println("AAA");
		test();   // poziv metode!-staticke metode
		System.out.println("DDD");
	}

}
