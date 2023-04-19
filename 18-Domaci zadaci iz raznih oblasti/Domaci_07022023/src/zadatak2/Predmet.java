package zadatak2;

import java.util.Scanner;

// Napisati sledeće klase: 
//• Predmet ima specifičnu težinu i jednoslovnu oznaku vrste predmeta. 
//• Sfera je predmet zadat polušrečnikom.
//• Kvadar je predmet zadat dužinama ivica. 
//• Napisati klase koje omogućavaju obradu nabrojanih vrsta predmeta. Predvideti inicijalizaciju 
//zadatim vrednostima parametara (podrazumevano 1), dohvatanje oznake vrste predmeta, 
//izračunavanje zapremine, izračunavanje težine, čitanje predmeta sa glavnog ulaza i sastavljanja 
//tekstualnog opisa predmeta. 
//• Napisati main klasu koja sa glavnog ulaza pročita podatke o određenom broju predmeta i posle 
//toga na glavnom izlazu ispiše podatke o predmetima čije su težine iznad proseka. 

public abstract class Predmet {
	
	private double specTez;  // podatak specificna tezina
	
	protected Predmet(double ss) { // konstruktor
		specTez = ss;
	}

	 protected Predmet() {  // konstruktor
		specTez = 1; // inicijalizacija
	} 
	 
	public abstract char vr();

	public abstract double V(); // zapremina
	
	public double T() {        // tezina
		return V() * specTez;   // ro = m/V -> T = V*ro formula
	}

	public void citaj() {   // citanje
		Scanner sc = new Scanner(System.in);
		specTez = sc.nextDouble();
	}

	public String toString() {   // tekstualni opis predmeta
		return vr() + "[" + Double.toString(specTez) + "]";
	}
	
}
