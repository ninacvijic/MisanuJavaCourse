package cvija;
   // dodati <T> kod naziva klase da klasu pretvorimo u genericku
public class A<T> {  // Genericka klasa! Ovde je T parametar tipa, koji
	// ce biti zamenjen stvarnim tipom kada se napravi objekat tipa A.
	
	 // int a;  // ovo smo pre radili. Ovde sada toga nema!!!
	// int ob;
	T ob; // sada ovako!  // objekat ob - polje! 

	A(T o)  // konstruktor   // T stavljamo umesto int, String, itd.
	{
		ob = o;
	}
	
	// sada dodajemo seter i geter: 
	public void setOb(T ob)
	{
		this.ob = ob;  
	}
	
	public T getOb() {
		return ob;
	}

	void prikaziTip() {   // opsta sintaksa 
		System.out.println("Tip T je: " + ob.getClass().getName());  // **novo**  // pristup preko naseg objekta ob tipu T!!! 
	}
}
