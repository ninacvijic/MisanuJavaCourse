package cvija;

public class Exception {
	
	public static void checkAge(int age) throws InvalidAgeException {  // metoda  // throws + naziv nase pom.klase (ali zar ne treba tip izuzetka???)
		
		System.out.println("Checking Age Validity : (" + age + ")");
		if (age < 0 || age > 100)
			throw new InvalidAgeException(age);  // ovde pozivamo klasu koju smo implementirali // tu bacamo izuzetak // u zagradi je age, podatak iz pom.klase
		System.out.println("Age: " + age + " is a valid age.");
	}

	public static void main(String[] args) {
		try {
			checkAge(25);  // poziv metode
			checkAge(-5);
		} catch (InvalidAgeException e) {
			System.out.println("Caught: " + e);  // ispis onoga iz pomocne klase!
		} finally {
			System.out.println("Finally blok.");  // ovo dodao cisto da imamo i finally block // ilustrativno
		}
		
	}

}
