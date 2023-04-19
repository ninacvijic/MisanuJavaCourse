package UUP;

import java.util.Scanner;

public class Bajt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Pretvaranje veličine memorije iz kilobajta u bajte");
		System.out.println("Veličina datoteke u kilobajtima: ");

		int kb = input.nextInt();

		System.out.println("Veličina datoteke u bajtima: " + kb * 1024);

	}

}
