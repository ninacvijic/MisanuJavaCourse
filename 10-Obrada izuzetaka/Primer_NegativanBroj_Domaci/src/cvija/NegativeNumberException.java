package cvija;

// ** Negativan broj **  ------>  Ispitati da li je broj negativan preko User Define Exception

public class NegativeNumberException extends Throwable {
	
	private double number;
	
	public NegativeNumberException( double n ) {
		number = n;	
	}
	
	public String toString() {   
		return "Number: " + number + " is a negative number.";
	}
	
	
	

}
