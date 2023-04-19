package cvija;

// 6. Napisati genericku klasu “OpisnaOcena” koja omogućuje smeštanje vrednosti (Ocena, OpisnaOcena). 
// Ocena je celobrojna vrednost, a OpisnaOcena je String-ovna vrednost. 
// Ispis uraditi za ocene od 1 – 5. 

public class OpisnaOcena<T, V> {
	
	T ob1;
	V ob2;
	
	OpisnaOcena(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	public T getOb1() {
		return ob1;
	}
	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}
	public V getOb2() {
		return ob2;
	}
	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}

	public String toString() {
		return "(Ocena,OpisnaOcena): " + ob1 + ", " + ob2;
	}
	
	

}
