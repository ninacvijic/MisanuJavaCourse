package cvija;

public class Main {

	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		
		// Kada odredjenoj niti zelite da dodate prioritet prilikom izvrsavanja, pozovite metodu
		// setPriority() koja je clan klase Thread.
		// void setPriority(nivo)
		// Parametrom "nivo" zadajete nivo prioriteta niti za koju je metoda pozvana.
		// Vrednost mora biti u opsegu izmedju MIN_PRIORITY i MAX_PRIORITY,
		// a vrednosti tih konstanti su izmedju 1 i 10. (znaci min je 1, a max je 10)
		// Podrazumevana vrednost iznosi 5, a moze se zadati preko NORM_PRIORITY.
		 
		a.setPriority(Thread.MIN_PRIORITY + 5);  // po deafultu min je 1  // mozemo dopisati neke vrednosti npr + 5 // 1+5 --> 6
		b.setPriority(Thread.MAX_PRIORITY - 7); // max je 10 // 10-7 --> 3  // pozeljno da krajnje vrednosti budu isto u opsegu 1 .. 10 
		  // konstante --- zato plave boje
		// izvrsavala bi se prva nit koja je pozvana start metodom, znaci a pa b
		// kad smo dodali max i min priority izvrsavala se prvo nit b, pa nit a 
		// ali kad smo dopisali + 5 i - 7 sad se opet nit a prva izvrsava(Consola)
		a.start();      
		b.start();
		
	System.out.println("Kraj glavne niti. ");  // zasto se ovo prvo pise ispise u Consoli???

	}

}
