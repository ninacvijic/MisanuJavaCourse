package cvija;
                     // prvo pravimo interface, pa tek onda class-u
public interface TestiraBroj {  // znaci sad je ovde public interface, a ne public class !
	
	// Ispitati da li je broj paran. --- Zadatak
	
	// deklaracija metode:
	boolean test(int n);   // apstraktna metoda
	
	// uzimamo boolean jer je logicki, ako je br paran bice jeste true, a ako nije false
	

}
// da nije apstraktna metoda bilo bi kao ranije:
// npr: 
// boolean test(int br){
// if (br % 2 == 0)
// System.out,println("Broj je paran);
// else 
// neparan
// }
// znaci imala bi ovo telo metoda!