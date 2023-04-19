package cvija;
    // primer sa nizovima!!!

public class Main {
	
	public static<T> void stampajNiz(T[] pocetniNiz) {   // genericka metoda za prolazak kroz nizove!!!  // staticka metoda
	for(T element : pocetniNiz)    // unapredjena for petlja
		System.out.printf("%s ", element);
	}

	public static void main(String[] args) {
// prvo ovo  kucam:
		Integer[] i = { 1, 2, 3, 4, 5, 6, 7 };  // nizovi, ali navedeni preko Omotacke klase
		Double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] c = { 'j', 'a', 'v', 'a' };  // kad ovo zavrsim idem iznad da otkucam metodu!

		// opet se vracam ovde:
		System.out.println("Sadrzaj celobrojnog niza: ");
		stampajNiz(i); // mogu odmah ovako jer je staticka metoda
		
		System.out.println("\nSadrzaj double niza: ");
		stampajNiz(d);
		
		System.out.println("\nSadrzaj niza karaktera: ");
		stampajNiz(c);	
	}

}

