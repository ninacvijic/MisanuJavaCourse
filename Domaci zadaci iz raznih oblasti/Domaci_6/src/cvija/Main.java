package cvija;

public class Main {

	public static void main(String[] args) {
		
		OpisnaOcena<Integer, String> oo1 = new OpisnaOcena<Integer, String>(1, "Nezadovoljava");
		OpisnaOcena<Integer, String> oo2 = new OpisnaOcena<Integer, String>(2, "Dovoljan");
		OpisnaOcena<Integer, String> oo3 = new OpisnaOcena<Integer, String>(3, "Dobar");
		OpisnaOcena<Integer, String> oo4 = new OpisnaOcena<Integer, String>(4, "Vrlodobar");
		OpisnaOcena<Integer, String> oo5 = new OpisnaOcena<Integer, String>(5, "Odlican");
		
		System.out.println("Ocene od 1 do 5: ");
		System.out.println(oo1.toString());
		System.out.println(oo2.toString());
		System.out.println(oo3.toString());
		System.out.println(oo4.toString());
		System.out.println(oo5.toString());
	}

}
