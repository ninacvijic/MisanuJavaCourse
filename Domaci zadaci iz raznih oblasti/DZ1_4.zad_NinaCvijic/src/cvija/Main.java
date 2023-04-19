package cvija;

/*
4. Napisati sledeći paket tipova i tom prilikom predvideti
- Energentu može da se odredi energetska vrednost izražena u relnim kilo džulima.
- Apstraktna namirnica je energent koji ima ime (niska znakova) i jedinstven, automatski generisan 
celobrojan identifikator, koji mogu da se dohvate. Tekstualni opis je ime_namirnice[id].
- Hrana je namirnica koja se zadaje težinom date namernice izraženom u gramima (realan broj) i 
procentualnim udelom belančevina, masti i ugljenih hidrata (realni brojevi) u ukupnoj težini. Mogu da se 
dohvate težinski udeo belančevina, masti i ugljenih hidrata i ukupna težina. Energetska vrednost 1g 
belančevina iznosi 16,7kJ, masti 37,6kJ, a ugljenih hidrata 17,2kJ. Tekstualni opis 
jeime_hrane[id](težina,energetska_vrednost). Greška je ako zbir procentualnih udela belančevina, masti i 
ugljenih hidrata prelazi 100%.
- Piće je namirnica koje se zadaje količinom u litrima (realan broj) i energetskom vrednošću jednog litra 
izraženoj u kJ (realan broj). Može da se dohvati količina. Tekstualni opis je 
ime_pića[id](količina,energetska_vrednost).
- Meni sadrži niz namirnica. Stvara se prazan, zadatog kapaciteta, posle čega se namirnice dodaju jedna po 
jedna. Može da se odredi ukupna energetska vrednost menija i da se sastavi tekstualni opis menija u 
obliku{namirnica,…,namirnica}[uk_energetska_vrednost], gde je namirnica tekstualni opis jedne 
namernice u sastavu menija. Greška je ako se meni prepuni.
Napisati na jeziku Java program (klasu s glavnom funkcijom) koji napravi jedan meni u koji smesti nekoliko 
namirnica, a zatim na glavnom izlazu ispiše sadržaj formiranog menija. Svi parametri treba da budu 
konstante (ne treba ništa učitavati
*/

public class Main {

	public static void main(String[] args) {     // Meni iz teksta zadatka!!!
		
		int kapacitet = 3;  // zadati kapacitet menija-proizvoljno
		
		Hrana[] nizNamirnica = new Hrana[kapacitet]; // stvara se prazan meni, zadatog kapaciteta
		
		nizNamirnica[0] = new Hrana("Mleko", 25.00);  // dodavanje namirnica
		nizNamirnica[1] = new Hrana("Jaje", 65.00);
		nizNamirnica[2] = new Hrana("Torta", 180.00);

		double ukupnaEnergetskaVrednost = 0;

		for (int i = 0; i < kapacitet; i++) {
			ukupnaEnergetskaVrednost += nizNamirnica[i].energetskaVrednost();  //odredjivanje uk energ.vrednosti menija
		}

		System.out.println("Opis Menija:\nNamirnice: { ");    // tekstualni opis Menija
			for (int i = 0; i < nizNamirnica.length; i++) {
			nizNamirnica[i].tekstualniOpis();
		}
	    System.out.println("}");
		System.out.println("Ukupna energetska vrednost: ");
		System.out.println("[" + ukupnaEnergetskaVrednost + " kJ]");
	}

	}


