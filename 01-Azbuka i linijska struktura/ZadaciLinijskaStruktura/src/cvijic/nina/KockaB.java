package cvijic.nina;
import java.io.*;

public class KockaB {

	public static void main(String[] args) throws Exception {
		// a- stranica kocke
		// P- povrsina kocke
		// V- zapremina kocke
		
		double a, P, V;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos stranice kocke
		System.out.print("Unesite stranicu kocke a: ");
		a = Double.parseDouble(ulaz.readLine());
				
		// Izracunavanje povrsine i zapremine kocke
		P=6*a*a;
		V=Math.pow(a,3);
		
		// Stampanje vrednosti povrsine i zapremine kocke
		System.out.println("Za unetu stranicu kocke a= " + a + " izracunata povrsina je " + P + " a zapremina " + V);
	}

}
