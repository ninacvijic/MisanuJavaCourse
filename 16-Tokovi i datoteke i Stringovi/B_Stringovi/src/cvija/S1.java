package cvija;

public class S1 {

	public static void main(String[] args) {
		
		// Stringovi se predstavljaju klasom String
		String str = "12345jfhfud..eidojf%$^&*(:)ASDO_JSJS"; // String moze biti bilo koji znak, a da je pod " "
		System.out.println(str);
		
		// Kreiranje stringa pomocu kljucne reci new
		String str1 = new String("Utorak, 24. januar. ");
		System.out.println(str1);
		
		// Inicijalizacija stringa postojecim stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1); // stampa u Consoli isto Podatak1
		System.out.println(s2);
		
		// Inicijalizacija nizom char vrednosti - IV nacin
		char s3[] = {'J', 'A', 'V', 'A'};
		System.out.println(s3);
		
		// Inicijalizacija podnizom
		String s4 = new String(s3, 1, 3); // iz stringa s3,tj iz niza char s3, i to od 1.elementa, tj indeksa, zakljucno sa trecim
		System.out.println(s4); 
		
		
	}

}
