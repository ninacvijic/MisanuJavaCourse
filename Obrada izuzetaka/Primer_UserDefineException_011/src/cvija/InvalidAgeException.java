package cvija;

public class InvalidAgeException extends Throwable {  // nasledjuje  // nasa klasa nasledjuje super klasu Throwable iz koje potice sve!!! 
                                                       // mogli smo pisati i extends Exception(naziv nase main klase), ali to tek kad je kreiramo, ali mozemo ostaviti i Throwable
	private int age;  // polje-podatak
	
	InvalidAgeException(int a){  // konstruktor
		age = a;
	}
	
	public String toString() {    // metoda
		return "Age: " + age + " is not a valid age.";
	}
	
	// 0 - 100  // ove cemo granice staviti
}
