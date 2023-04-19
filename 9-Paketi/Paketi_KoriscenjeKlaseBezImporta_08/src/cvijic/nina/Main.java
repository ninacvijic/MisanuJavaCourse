package cvijic.nina;

// ovde bi bio import klase Scanner, ali to ne radimo!!

public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);  //ovde tokom kreiranja obj klase Scanner, navodim koren klase-preko biblioteke do klase

		double r, a;
		
		System.out.println("Unesite poluprecnik: ");
		r = sc.nextDouble();
		
		a = 3.14 * r * r;
		System.out.println("Povrsina kruga: " + a);

		sc.close();

	}

}
