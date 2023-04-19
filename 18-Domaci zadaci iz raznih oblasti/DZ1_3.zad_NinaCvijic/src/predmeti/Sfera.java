package predmeti;

import java.util.Scanner;

public class Sfera  extends Predmet{  //klasa sfera
	
public static final char VR = 'S';  //vrsta
	
	private double r;    // poluprecnik
	
	public Sfera(double ss, double rr) {  // konstruktor //inicijalizacija
		super(ss);
		r = rr;
	}
	
	public Sfera() {  // inicijalizacija
		this(1, 1);
	}
	
	public char vr() {  //vrsta
		return VR;
	}
	
	public double V() {
		return 4./3 * r*r*r * Math.PI;  //zapremina
	}
	
	public void citaj() {   //citanje
		super.citaj();
		Scanner sc = new Scanner(System.in);
		 r = sc.nextDouble();
	}
	
	public String toString() {   //tekstualni opis
		return super.toString() + r + "]";
	}

}
