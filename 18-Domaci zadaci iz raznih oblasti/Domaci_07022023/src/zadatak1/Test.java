package zadatak1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		A t1 = new A(); // obj
		A t2 = new A();
		
        System.out.print("t1: ");  // koordinate tacke t1
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		t1.set(x, y);
		
		System.out.print("t2: ");  // koordinate tacke t2
		t2.read();
		
		System.out.println("t1: \n(" + t1.getX() + "," + t1.getY() + ")");
		
		System.out.println("t2: ");
		t2.write();
		
		System.out.println("Rastojanje: " + t1.rastojanje(t2));
        sc.close();
	}

}
