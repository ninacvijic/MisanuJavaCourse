package cvija;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			System.out.println("a= " + a);
			int b = 10 / a;
			
			int c[] = {1};
			c[10] = 100;
			
		} catch (ArithmeticException  |  ArrayIndexOutOfBoundsException e) {  // iz iste klase su izuzeci(RuntimeException), zato ih mozemo staviti u isti catch blok
			System.out.println("Uhvacen Exception. " + e);  // dodali smo e i ovde da vidimo sta vidi kompajler // kaze koji izuzetak
		}                                                     // uhvatice "ili" jednu ili drugu gresku, ne moze obe!!!// hvata prvu koja je u try-u
		System.out.println("Nakon try/catch bloka. ");

	}

}
