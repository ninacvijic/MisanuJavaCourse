package zadatak2;

/*
 * Uneti u Scanner:
 * k / 0.5 / 1 / 2 / 3 / /
 * s / 2.8 / 1  / /
 * s / 1.8 / 0.75  / /
 * k / 1.5 / 2 / 2 / 2 / /
 *  .(tacka) /
 * ( / = Enter)
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Predmet[] p = new Predmet[100];
		double t = 0;
		int n = 0;
		
		radi: while(true) {
			switch(sc.next().charAt(0)) {
			case 's': case 'S': 
				p[n] = new Sfera();
				break;
			case 'k': case 'K':
				p[n] = new Kvadar();
				break;
			case '.': 
				break radi;
			}
		if(p[n] != null) {
			p[n].citaj();
			System.out.println(p[n] + " T=" + p[n].T());
			t += p[n++].T();
		}
	}
		if(n != 0)
			t /= n;
		System.out.print("\nTsr= " + t + "\n\n");
		for(int i = 0; i < n; i++)
			if(p[i].T() > t)
				System.out.println(p[i] + " T= " + p[i].T());
	}	
}

/*
 Sfera s = new Sfera();
Kvadar k = new Kvadar();

System.out.println("Kvadar:"); 
System.out.println("Vrsta: " + k.vr());
System.out.println("Unesite podatke: "); // 4 unosa, spec.tezina i 3 ivice
k.citaj(); 
System.out.println("Zapremina kvadra:" + k.V());
System.out.println("Tezina:" + k.T());
System.out.println("Opis kvadra-u zagradi specificna tezina a posle zagrade duzina ivica: " + k.toString());

System.out.println("----------------------------------------------------------------");

System.out.println("Sfera:"); 
System.out.println("Vrsta: " + s.vr());
System.out.println("Unesite podatke: "); // 2 unosa, spec.tezina i poluprecnik
s.citaj(); 
System.out.println("Zapremina sfere:" + s.V());
System.out.println("Tezina:" + s.T());
System.out.println("Opis sfere-u uglastoj zagradi specificna tezina a posle zagrade duzina poluprecnika: " + s.toString());
*/
	
