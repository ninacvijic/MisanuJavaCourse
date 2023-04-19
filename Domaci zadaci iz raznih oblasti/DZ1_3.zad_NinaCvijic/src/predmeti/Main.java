package predmeti;

//imali ranije za domaci rad

import java.util.Scanner;

public class Main {  // ispitivanje klasa predmeta

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Predmet[] p = new Predmet[100];
		double q = 0;
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
			System.out.println(p[n] + "  (Q=" + p[n].Q() + ")");
			q += p[n++].Q();
		}
		}
		if(n != 0)
			q /= n;
		System.out.print("\nQsr= " + q + "\n\n");
		for(int i = 0; i < n; i++)
			if(p[i].Q() > q)
				System.out.println(p[i] + " (Q= " + p[i].Q() + ")");
	}	

	}

/*
 * Uneti u Scanner:
 * k / 0.5 / 1 / 2 / 3 / /
 * s / 2.8 / 1  / /
 * s / 1.8 / 0.75  / /
 * k / 1.5 / 2 / 2 / 2 / /
 *  .(tacka) /
 * ( / = Enter)
*/

