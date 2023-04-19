package cvija;

public class Main {

	public static void main(String[] args) {

		Valjak v1 = new Valjak(2, 3);

		System.out.println("v1   : " + v1 + " " + v1.V());

		Kanta k1 = new Kanta(1, 3, 10);

		System.out.println("k1(10)   : " + k1 + " " + k1.V());
		System.out.println("k1-=5:" + k1.odlij(5));
		System.out.println("k1+=4:" + k1.dolij(4));

		Kanta k2 = new Kanta(0.6, 5);

		System.out.println("k2(0)   : " + k2 + " " + k2.V());
		System.out.println("k2<=k1:" + k2.presipaj(k1));
		System.out.println("k1:" + k1);

	}

}
