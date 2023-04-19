package predmeti;

import java.util.Scanner;

public abstract class Predmet {  // apstraktna klasa predmeta
	
private double sigma;  // specificna tezina
	
	protected Predmet(double ss) { // konstruktor  //inicijalizacija
		sigma = ss;
	}

	 protected Predmet() {  // konstruktor
		sigma = 1; // inicijalizacija
	} 
	 
	public abstract char vr();  //vrsta

	public abstract double V(); // zapremina
	
	public double Q() {        // tezina
		return V() * sigma;   
	}

	public void citaj() {   // citanje
		Scanner sc = new Scanner(System.in);
		sigma = sc.nextDouble();
	}

	public String toString() {   // tekstualni opis predmeta
		return vr() + "[" + sigma + "|";
	}
	
}

