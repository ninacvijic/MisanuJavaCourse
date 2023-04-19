package cvija;

public class Main {

	public static void main(String[] args) {
		
		Radnik r1 = new Radnik("Pera", 100, 150000);  // pod "" jer je string, paziti!!!
		Radnik r2 = new Radnik("Mika", 80, 12000);
		// za ostale radnike sve isto pisemo - automatizovali smo
		
		System.out.println("Prihod prvog radnika: " + r1.prihod());
		System.out.println("Plata drugog radnika: " + r2.plata());
		System.out.println("Ime/Plata: " + r1.opis());
		System.out.println("Ime/Plata: ");   // ovako radi, kad je void u pom.klasi, 
		r2.drugiOpis();                     // u main mora poziv metode biti sam, bez S.o.p.!!!
	               
		
		
	}
}