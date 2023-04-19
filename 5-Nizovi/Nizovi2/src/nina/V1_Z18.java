package nina;

import java.util.Scanner;

public class V1_Z18 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		double x[] = new double[100];
		double y[] = new double[100];
		char oblast[] = new char[100];
		
		System.out.println("Unesite broj tačaka n: ");
		int n = ulaz.nextInt();
		
		System.out.println("Unesite koordinate tačaka x i y:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextDouble();
			System.out.print("y[" + i + "] = ");
			y[i] = ulaz.nextDouble();
			
			boolean k1 = Math.pow(x[i] - 1, 2) + Math.pow(y[i], 2) <= 1;
			boolean k2 = Math.pow(x[i] - 1, 2) + Math.pow(y[i] - 1, 2) <= 1;
			boolean k3 = Math.pow(x[i], 2) + Math.pow(y[i] - 1, 2) <= 1;
			
			if (k1 && !k2 && k3)
				oblast[i] = 'A';
			else if (k1 && k2 && !k3)
				oblast[i] = 'B';
			else if (!k1 && k2 && k3)
				oblast[i] = 'C';
			else
				oblast[i] = '*';
		}
		
		System.out.println("R. BR.\tX\tY\tOBLAST");
		
		for (int i = 1; i <= n; i++)
			System.out.println(i + "\t" + x[i] + "\t" + y[i] + "\t" + oblast[i]);
		
		ulaz.close();

	}

}
