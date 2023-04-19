package cvija;

import java.util.ArrayList;

public class Zad_5 {

	// a) Kreirati dinamički niz.
	// b) Unutar niza dodati 10 imena, koristeći ugrađenu metodu.
	// c) Ispisati sadržaj niza.
	// d) Na poziciji 5 dodati novo ime.
	// e) Odštampati trenutni sadržaj niza.
	// f) Obrisati jedno ime.
	// g) Odštampati trenutni sadržaj niza

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>(); // a)

		al.add("Ana"); // b)
		al.add("Hana");
		al.add("Lana");
		al.add("Una");
		al.add("Lena");
		al.add("Anja");
		al.add("Anka");
		al.add("Anika");
		al.add("Maja");
		al.add("Sanja");

		System.out.println("Lista imena: " + al); // c)

		al.add(4, "Luka"); // d)

		System.out.println("Dopunjena lista: " + al); // e)

		al.remove(0); // f)

		System.out.println("Trenutni sadrzaj niza: " + al); // g)

	}

}
