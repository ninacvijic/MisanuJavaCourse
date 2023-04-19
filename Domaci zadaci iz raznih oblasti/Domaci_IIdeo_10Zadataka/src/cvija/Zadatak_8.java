package cvija;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak_8 {
	
	public static double[] koeficijentBeta(double x[], double f[], int n) {
		double s1=0,s2=0,s3=0,s4=0;
		double[]koeficijent = new double[5];
		for(int i =1; i<=n;i++) {
			s1+=Math.log(x[i]);
			s2+=Math.log(f[i]);
			s3+=Math.log(x[i])*Math.log(f[i]);
			s4+=Math.log(x[i])*Math.log(x[i]);
		}
		koeficijent[1] = (s1*s2 - n*s3) / (Math.pow(s1, 2) - n*s4);	
		koeficijent[0] = Math.pow(10, ((s2 - koeficijent[1] * s4) / n));
				return koeficijent;
	}
	
	public static void main(String[] args) throws Exception{
		double[]x = new double[100];
		double[]f = new double[100];
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.#####");
		
		System.out.println("Unesite dimenziju k nizova: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		System.out.println("Unesite elemente niza x: ");
		for(int k = 0; k <= n; k++) {
			System.out.print("x[" + k + "]= ");
			x[k] = Double.parseDouble(ulaz.readLine());}
		
		System.out.println("Unesite elemente niza f: ");
		for(int k = 0; k <= n; k++) {
			System.out.print("f[" + k + "]= ");
			f[k] = Double.parseDouble(ulaz.readLine());}
		
		System.out.println("\tX\tY(X)");
		
		for(double X = x[0]; X <= x[n]; X++) {
		double Y =koeficijentBeta(x, f, n)[0] * Math.pow(X, koeficijentBeta(x, f, n)[1]);
		
		System.out.println("\t" + df.format(X) + "\t" + df.format(Y));
		}
		
	}
}
