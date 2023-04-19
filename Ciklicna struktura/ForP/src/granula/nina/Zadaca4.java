package granula.nina;
import java.text.DecimalFormat;
public class Zadaca4 {

	// Fizika
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		// Štampanje zaglavlja 
		System.out.println("\tL\tW"); 
				
				double L, W; 
				for (L = 10.0; L <= 75.0; L++) 
				{
					W = 1.0 / (1.0 - 0.8 * Math.pow(L/100.0,2)); 
					System.out.println("\t" + L + "\t" + df.format(W));
				}
	}

}
