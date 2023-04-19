package zadatak3;

public class GenerickiNiz<T> { // genericka klasa-niz

	private T[] elementi;
	private int brojac;

	@SuppressWarnings("unchecked")
	public GenerickiNiz(int kapacitet) { // stvara se prazan g.niz zadanog kapaciteta
		elementi = (T[]) new Object[kapacitet];
	}

	public void setElement(T item) { // stvari se u g.niz dodaju pojedinacno
		if (brojac == elementi.length) {
			throw new IllegalStateException("Niz je pun!"); // javlja gresku ako se niz prepuni
		}
		elementi[brojac++] = item;
	}

	public T getElement(int index) { // pristup stvari sa zadanim rednim brojem
		if (index < 0 || index >= brojac) {
			throw new IndexOutOfBoundsException("Indeks je van opsega!"); // javlja gresku ako je indeks izvan opsega
		}
		return elementi[index];
	}

	public int getBrojac() { // moze da se dohvati broj stvari u nizu
		return brojac;
	}

}
