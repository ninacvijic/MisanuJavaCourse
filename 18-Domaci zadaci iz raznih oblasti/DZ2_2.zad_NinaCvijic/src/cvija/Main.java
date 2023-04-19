package cvija;

/*
 Написати на језику Јава програм који направи једног студента, додаје му три испита и испише га на главном излазу. Користити само константне 
 податке (не треба ништа учитавати с главног улаза).
 */

public class Main {

	public static void main(String[] args) {
		
		   Student marko = new Student("Marko", 20060055, 45);
		   
		    marko.dodaj(new Ispit("SI2AS2", new Ocena(9)));
		    marko.dodaj(new Ispit("SI2OR2", new Ocena(5)));
		    marko.dodaj(new Ispit("SI2OO1", new Ocena(10)));
		    marko.pisi();
		    System.out.println();

	}

}









 

