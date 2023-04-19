package zadatak2;

import java.util.Scanner;

public class Sfera extends Predmet {
	
	public static final char VR = 'S';
	
	private double r;    // poluprecnik
	
	public Sfera(double ss, double rr) {  // konstruktor
		super(ss);
		r = rr;
	}
	
	public Sfera() {  // inicijalizacija
		this(1, 1);
	}
	
	public char vr() {
		return VR;
	}
	
	public double V() {
		return 4./3 * r*r*r * Math.PI;
	}
	
	public void citaj() {
		super.citaj();
		Scanner sc = new Scanner(System.in);
		 r = sc.nextDouble();
	}
	
	public String toString() {
		return super.toString() + r;
	}
	
}
