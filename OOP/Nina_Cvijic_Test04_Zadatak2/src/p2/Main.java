package p2;

import java.util.Scanner;
import p1.BankAccount;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount b = new BankAccount();
		
		System.out.println("Trenutni iznos na racunu: ");
		int uneto = sc.nextInt();
		b.setPocVr(uneto);

		System.out.println("Iznos uplate: ");
		int un = sc.nextInt();
		b.setSuma(un);
				
		System.out.println(b.toString() + b.Sum( uneto, un));
		
		
	}

}
