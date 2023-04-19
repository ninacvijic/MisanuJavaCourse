package cvija;

public class DivljaPatka implements Patka{  // pravimo klasu koja ce implementirati interfejs Patka
	                                        // dodajemo ovo implements u zaglavlju!*
	public void kvace() {
		System.out.println("Kvace");  // ispis poruka
	}
	
	public void leti() {
		System.out.println("Leti");
	}

}
// crveni se, sve dok se ne implementiraju i metode iz interfejsa!!!(kad ih otkucamo, prestane se crveniti)
// metode nose isti naziv kao u interfejsu