package cvijic.nina;

public class InkrementA {

	public static void main(String[] args) {

		int i = 3, j = 4;
		System.out.println("i = " + i + " j = " + j);
		
		j = 3 + --i; // j = 3 + (i - 1) umanji i pa izračunaj
		System.out.println("i = " + i + " j = " + j);
	}

}
