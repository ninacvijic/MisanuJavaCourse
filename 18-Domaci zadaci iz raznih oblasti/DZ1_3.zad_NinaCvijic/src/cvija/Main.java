package cvija;

import java.util.Scanner;

import predmeti.*;  // import cijelog drugog paketa

public class Main {  // ispitivanje klase polica za predmete
	
	private static class Greska extends Exception { // klasa za lokalne greske
		Scanner sc = new Scanner(System.in);
		String por;
		Greska(String p){
			por = p;
		}
			public String toString() {
				return "*** GRESKA: " + por;
			}
		}
	
	private static Predmet citaj() throws Greska {  // citanje predmeta
		System.out.println("Ukucajte vrstu predmeta(S za sferu, K za kvadar): ");
		Predmet p = null;
		Scanner sc = new Scanner(System.in);
			switch(sc.next().charAt(0)) {
			case 's': case 'S': 
				p = new Sfera();
				break;
			case 'k': case 'K':
				p = new Kvadar();
				break;
			default: 
				throw new Greska("Nepoznata vrsta predmeta! ");	
			}
		System.out.println("Unesite specificnu tezinu predmeta i dimenzije: ");
		p.citaj();
		return p;
	}

	public static void main(String[] args) {  // glavna mmetoda
		Scanner sc = new Scanner(System.in);
		
		Polica p = new Polica(0, 1);
		
		radi: while(true) {
			try {
				System.out.print("\n1. Dodavanje na zadato mesto\n" + 
			                      "2. Dodavanje na prvo slobodno mesto\n" + 
						          "3. Uzimanje sa zadatog mesta\n" + 
			                      "4. Stanje police\n" + 
						          "5. Sadrzaj police\n" + 
			                      "6. Praznjenje police\n" + 
						          "0. Kraj rada\n\n" + 
			                      "Vas izbor(0-6)? ");
				
				int izb = sc.nextInt();
				switch(izb) {					
				case 1:{
					System.out.println("Unesite indeks: ");
					int i = sc.nextInt();
					p.stavi(citaj(), i);
					break;}
				case 2:
					p.stavi(citaj());
					break;
				case 3:{
			         System.out.println("Unesite indeks: ");
					System.out.println(p.uzmi(sc.nextInt()));
					break;}
				case 4:
					System.out.println("Kapacitet= " + p.kapacitet() + " slobodno= " + p.slobodno() + " \nNosivost= " + p.nosivost() + " teret= " + p.teret());
					break;
				case 5:
					System.out.println(p);
					break;
				case 6:
					p.prazni();
					break;
				case 0:{
					break radi;}
				default:
					throw new Greska("Nedozvoljen izbor! ");	
				}
			} catch (GreskaPolica | Greska e) {
				System.out.println(e);
			}
		}
		
		
	}

}
