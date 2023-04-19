package cvija;

public class Main {

	public static void main(String[] args) {
		
		try {    // u try catch block smestamo kod koji zelimo da resimo(tj sve ono sto bismo pisali bez njega, da nije izuzetak u pitanju)
			// prvi problem:
			int a = 0;    // inicijalizacija promenljive
			System.out.println("a= " + a);
			int b = 10 / a;   // rizicna operacija  // prekine se program,  ni ne ide se na drugi problem, zato u Consoli stampa sta stampa
			
			// drugi problem:
			int c[] = {1};  // inicijalizacija niza(jedan od nacina)  // niz od 1 elementa
			c[10] = 100;  // na desetom mestu niza da smestimo vrednost 100  // rizicna operacija  // ima samo 1 mesto a ne 10
			
		} catch(ArithmeticException e) {
			System.out.println("Deljenje nulom. " + e);  // dodali naknadno ovo e  // to nam ispise pored poruke nama i ono sto kompajler vidi
			                                             // moze i e.getMessage(); // moze i e.getLocalizedMessage();  // mogu i dole staviti kod drugog catch
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci indeks unutar niza. ");  // kompajler uopste nije gledao 2.problem, izignorisao i njega i njegov catch
		}
		System.out.println("Nakon try/catch,catch bloka");  // odavde opet program radi

	}

}
