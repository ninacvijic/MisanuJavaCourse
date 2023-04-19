package cvijic.nina;

import java.io.*;

public class Vezba4 {

	public static void main(String[] args) throws Exception {

		double a, b, c, P, V;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite stranicu kvadra a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu kvadra b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu kvadra c: ");
        c = Double.parseDouble(ulaz.readLine());
        
        P = 2 * (a*b + b*c + a*c);
        V = a*b*c;
        
        System.out.println("Povrsina kvadra iznosi: " + P + " a zapremina: " + V);
        
	}

}
