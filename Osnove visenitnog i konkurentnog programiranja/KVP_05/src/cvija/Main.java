package cvija;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();

		Thread t1 = new Thread(a, "Nina");
		Thread t2 = new Thread(b, "Ana");
		Thread t3 = new Thread(c, "Hana");

		t1.start();
		t2.start();
		t3.start();

	}

}
