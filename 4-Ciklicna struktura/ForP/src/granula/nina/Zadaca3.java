package granula.nina;
import java.text.DecimalFormat;
public class Zadaca3 {

	// Kombinacija sume i proizvoda
	
	public static void main(String[] args) {
		
		double s = 0;
		double p = 1;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		for (int i = 1; i <= 50; i++) {
			for (int j = 1; j <= i; j++) {
				if (j != 3)
					p *= (j + 2.0) / (j - 3.0);
			}
			s += p;
		}
		
		System.out.println("Dobijena vrednost sume je " + df.format(s));
	}

}
