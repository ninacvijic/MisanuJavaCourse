package cvija;

import java.util.Scanner;

public class Main {  // ispitivanje klase veriznih razlomaka

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Unesite n: ");
			int n = sc.nextInt();
			if(n <= 0)
				break;
			
			Verizni v = new Verizni(n);
			
			while(true) {
				System.out.println("Unesite i i a[i]: ");
				try {
					v.postavi(sc.nextInt(), sc.nextDouble());
				} catch(IndeksException e) {
					if(e.ind() == -1)
						break;
					System.out.println(e);
				}
			}
			System.out.println("\n" + v);
			
			System.out.println("Unesite xmin, xmax i dx: ");
			double xmin = sc.nextDouble();
			double xmax = sc.nextDouble();
			double dx = sc.nextDouble();
			System.out.println("\nx\tv(x)\n================================================");
			for(double x = xmin; x <= xmax; x+=dx) {
				System.out.print(x + "\t");
				
				try {
					System.out.println(v.vr(x));
				} catch (NulaException e) {
					System.out.println("Ne moze! ");
				}
			}
		}
		

	}

}
