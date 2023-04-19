package cvija;

public class Main {

	public static void main(String[] args) {
		// Simulacija kviza-Zadatak!!!
		
		Pitanje p = new Pitanje();
		
		System.out.println(p.odg());
		// na svaki Run mi posalje razlicit odgovor
		
		System.out.println(p.odg());
		System.out.println(p.odg());
		// i sad za svako Run dobijemo 3 razlicita odgovora
		
        // Uvek su razliciti odgovori zbog metode koja slucajno bira vrednosti izmedju 0 i 1
		// mi je pomnozili sa 100 da lakse pravimo interval
	}

}
