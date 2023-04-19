package zadatak3;

/*
 * Napisati sledeće klase: 
*
• Apstraktan teret ima jedinstven, automatski generisan celobrojan dentifikator i zadatu specifičnu 
težinu. Može da se dohvati jednoslovna oznaka vrste, da se odredi zapremina I težina i da se sastavi 
tekstualn opis koji sadrži oznaku vrste i identifikator. 
• Sanduk je teret oblika kvadra zadatih dužina ivica. Oznak vrste je S.
• Bure je teret oblika valjka zadatog poluprečnika osnove i visine. Oznaka vrste je B.

• Generički niz sadrži stvari nekog tipa. Stvara se prazan zadatog kapaciteta posle čega se stvari 
dodaju pojedinačno (greška je ako se niz prepuni). Može da se dohvati broj stvari u nizu i da se pristupi 
stvari sa zadatim rednim brojem (greška je ako je indeks izvan opsega). 

• Apstraktno vozilo ima zadatu sopstvenu težinu. Može da se odredi ukupna težina i vučna sila vozila 
i da se sastavi tekstualni opis vozila. Vučna sila predstavlja težinu terete koji vozilo može da povuče. 
• Lokomotiva je vozilo zadate vučne sile. Tekstualni opis je L(ukTezina | vučnaSila). 
• Vagon je vozilo koje sadrži niz terete. Stvara se prazan zadatog kapaciteta posle čega se terete 
dodaju pojedinačno. Vučna sila vagona je 0. Teksutalni opis je oblika V(ukTežina|teret, ... teret).
• Voz se sastoji od niza vozila. Stvara se prazan zadatog kapaciteta posle čega se vozila dodaju 
pojedinačno(greška je ako se voz preoptereti, tj. ako ukupna težina svih vozila i tereta premaši 
ukupnu vučnu silu vozila u vozu). Može da se dohvati broj vozila u vozu, da se proveri da li bi se 
voz preopteretio priključivanjem zadatog vozila i da se sastavi tekstualni opis voza koji sdarži 
tekstualne opise sadržanih vozila (jedno vozilo po redu).

*Napisati program koji napravi voz s jednom lokomotivom i dva vagona sa po dva tereta. Koristiti 
konstantne parameter (ne treba ništa učitavati sa glavnog ulaza).
 *  
 */

public class Main {

	public static void main(String[] args) throws Exception {

		GenerickiNiz<Voz> niz = new GenerickiNiz<Voz>(1); // primena generickog niza iz teksta zadatka

		Voz voz = new Voz(15000); // napravi voz sa...
		niz.setElement(voz);

		Lokomotiva lokomotiva = new Lokomotiva(5000, 2500); // jednom lokomotivom-postavka zadatka
		Vagon prviVagon = new Vagon(2500, 2); // dva vagona - postavka zadatka
		Vagon drugiVagon = new Vagon(2500, 2);

		niz.getElement(0).setVozilo(lokomotiva);
		niz.getElement(0).setVozilo(prviVagon);
		niz.getElement(0).setVozilo(drugiVagon);

		Sanduk sanduk1 = new Sanduk(2, 3, 2, 250); // sa po 2 tereta
		Sanduk sanduk2 = new Sanduk(4, 3, 3, 750);
		Bure bure1 = new Bure(5, 4, 350);
		Bure bure2 = new Bure(9, 4, 980);

		prviVagon.setTeret(sanduk1);
		prviVagon.setTeret(bure1);
		drugiVagon.setTeret(sanduk2);
		drugiVagon.setTeret(bure2);

		voz.opisVoza(); // opis voza(jedno vozilo po redu)

	}

}
