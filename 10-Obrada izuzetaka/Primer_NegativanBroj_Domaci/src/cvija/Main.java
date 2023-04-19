package cvija;

public class Main {

	public static void checkNumber(double number) throws NegativeNumberException {
		System.out.println("Checking Number: (" + number + ")");
		
		if (number < 0) {
			throw new NegativeNumberException(number);}
		
		System.out.println("Number: " + number + " is a valid number.");
	}

	public static void main(String[] args) {
		try {
			checkNumber(25.3);
			checkNumber(0.0);
			checkNumber(-5.2);
		} catch (NegativeNumberException e) {
			System.out.println("Caught: " + e);
		}

	}

}
