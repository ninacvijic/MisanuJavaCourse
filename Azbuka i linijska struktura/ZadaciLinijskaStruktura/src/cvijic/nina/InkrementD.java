package cvijic.nina;

public class InkrementD {

	public static void main(String[] args) {
		
		int i = 3, j = 4;
		System.out.println("i = " + i + " j = " + j);
		
		j = 3 + i++; // j = 3 + i, i = i + 1; tj. izračunaj pa uvećaj i
		System.out.println("i = " + i + " j = " + j);

	}

}
