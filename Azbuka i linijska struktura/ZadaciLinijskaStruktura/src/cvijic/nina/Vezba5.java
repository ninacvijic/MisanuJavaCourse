package cvijic.nina;
import java.io.*;

public class Vezba5 {

	public static void main(String[] args) throws Exception {
		
		double a,b,c,La,ma;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite stranicu a trougla: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu b trougla: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu c trougla: ");
        c = Double.parseDouble(ulaz.readLine());

        La = Math.sqrt(b*c*(Math.pow(b+c,2)-Math.pow(a,2)))/(b+c);
        ma= Math.sqrt(2*(b*b+c*c)-a*a)/2;
        
        System.out.println("Duzina simetrale ugla trougla iz temena A (La) iznosi: " + La + " a duzina simetrale stranice a trougla (ma) iznosi : " + ma);
        
	}

}
