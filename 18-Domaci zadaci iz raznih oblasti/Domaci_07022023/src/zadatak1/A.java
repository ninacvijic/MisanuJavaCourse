package zadatak1;

import java.util.Scanner;

// Napisati klasu koja opisuje tačke u ravni. Predvideti postavljanje koordinata, dohvatanje 
// koordinata, izračunavanja rastojanja do zadate tačke, čitanje tačke, pisanje tačke i glavnu funkciju za 
// ispitivanje klase. 

public class A {
	
private double x, y;  // Koordinate
	
	public void set(double a, double b) {  // Postavljanje koordinata
		x = a;
		y = b;
	}
	
	public double getX() {  // x-osa dohvatanje
		return x;
	}
	
	public double getY() {  // y-osa dohvatanje
		return y;
	}
	
	public double rastojanje(A t) {  // Racunanje rastojanja
		return Math.sqrt(Math.pow(x-t.x, 2) + Math.pow(y-t.y, 2));
	}
	
	public void read() {  // Ucitavanje tacke
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		sc.close();
	}
	
	public void write() {  // Ispisivanje tacke
		System.out.println("(" + x + "," + y + ")");
	}
}
