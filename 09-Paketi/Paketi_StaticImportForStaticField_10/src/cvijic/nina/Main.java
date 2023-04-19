package cvijic.nina;

import java.util.Scanner;

import static java.lang.Math.PI;   // ***

public class Main {

	public static void main(String[] args) {
		
		double r, a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite poluprecnik: ");
		r = sc.nextDouble();
		
		a = PI * r * r;  // umesto Math.PI
		System.out.println("Povrsina kruga: " + a);
		
		sc.close();

	}
}