package zadatak2;

import java.util.Scanner;

public class Kvadar extends Predmet{
	
	public static final char VR = 'K';
	
	private double a, b, c; // ivice
	
	public Kvadar(double ss, double aa, double bb, double cc) {
		super(ss);
		a = aa;
		b = bb;
		c = cc;
	}
	public Kvadar() {  // inicijalizacija
		this(1, 1, 1, 1);
	}
	
	public char vr() {
		return VR;
	}
	
	public double V() {
		return a * b * c;
	}
	
	public void citaj() {
		super.citaj();
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
	}
	
	public String toString() {
		return super.toString()  + a + "," + b + "," + c ;
	}
}
