package cvijic.nina;

import java.util.Scanner;  // *** ovde se importuje samo klasa Scanner
// import java.util.*;  // mogli i ovako import klase Scanner
// sa * spadaju sve pobrojane klase iz padajuceg menija, tj iz svih biblioteka koje su u util javi

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double r, a;
		System.out.println("Unesite poluprecnik: ");
		r = sc.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Povrsina kruga: " + a);

		sc.close();
	}

}
