package cvija;

/* Kreiramo klase A,B,C.
Neka te klase nasledjuju klasu Thread
(Za domaci Runnable)
Implementirati metode run()
U pokretackoj klasi Main kreirati objekte tih klasa i pokrenuti threadove tih klasa*/

public class Main {

	public static void main(String[] args) {
	
		A a = new A("Nina");
		B b = new B("Ana");
		C c = new C("Hana");
	
		a.start();
		b.start();
		c.start();

	}

}
