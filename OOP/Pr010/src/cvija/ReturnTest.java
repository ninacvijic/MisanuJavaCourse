package cvija;

public class ReturnTest {

	public static void test() {   // staticka metoda
		int a = 10;
		System.out.println("BBB");
		if (a == 10)
			return;    // prosli primer exit, a sad return!  // ne prekidamo izvrsenje kao sa exitom, nego se vracamo standardnom toku, napusta metodu a odlazi u main dio i nastavlja tamo gdje je stao
		System.out.println("CCC");
	}

	public static void main(String[] args) {  // odavde se krece program izvrsavati!

		System.out.println("AAA");
		test();  // poziv metode
		System.out.println("DDD");

	}

}
