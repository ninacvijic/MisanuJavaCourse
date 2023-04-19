package cvija;

public class Main {

	public static void main(String[] args) {
		
		// prvo sto radimo u main klasi je da pravimo objekat/-je
		Domine d1 = new Domine(2,4);
		Domine d2 = new Domine(3,4);
		
		// sad slijedi System.out.print da bismo ispitali funkcije, tj metode:
		System.out.println("Polje a prve domine: " + d1.getA());
		System.out.println("Polje b prve domine: " + d1.getB());
		System.out.println("Da li je prva domina ista kao druga?");
		System.out.println(d1.ista(d2));
		//System.out.println(d1.okreni());  // ne radi ovako !!!  // profu u jednom Projectu radilo ovako, u drugom ne !! ????
		System.out.println("Prva domina: " + d1.tekstualniOpis());
		System.out.println("Druga domina: " + d2.tekstualniOpis());
		
		System.out.println("Prva domina nakon zamene mesta: ");
	/*	d1.okreni();  // ne mozemo okreni() da stavimo u S.o.p.!!!
		System.out.println(d1.tekstualniOpis());  // hoce kad ovako  // opet stampamo d1.tekstualniOpis() i tu dobijamo raspored nakon okreni!!!
		*/
		
		System.out.println(d1.okreni().tekstualniOpis()); // ovako radi profu--poslao na Chatu ***
	}
	

}
