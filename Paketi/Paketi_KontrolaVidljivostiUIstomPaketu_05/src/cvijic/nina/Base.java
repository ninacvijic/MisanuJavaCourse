package cvijic.nina;

public class Base {
	
	private int n_pri = 1;   // podaci
	int n_def = 2;  // podrazumevani nivo pristupa
	protected int n_pro = 3;
	public int n_pub = 4;
	
	public Base() {     // konstruktor
		System.out.println("Konstruktor klase Base.");
		System.out.println("Base klasa n_pri = " + n_pri);
		System.out.println("Base klasa n_def = " + n_def);
		System.out.println("Base klasa n_pro = " + n_pro);
		System.out.println("Base klasa n_pub = " + n_pub);
	}
	

}
// Oblast vidljivosti za pakete(Packages):
// Oblast vidljivosti je klasa unutar koje je navedena oblast vidljivosti i sve klase unutar paketa.