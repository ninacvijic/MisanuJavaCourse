package nina.nina;
import java.util.Scanner;
public class Zad5B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		double C1, C2, Ce;
		System.out.println("Unesite kapacitet kondenzatora C1: ");
		C1= input.nextDouble();
		System.out.println("Unesite kapacitet kondenzatora C2");
		C2= input.nextDouble();
		int veza;
		System.out.println("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu");
		veza=input.nextInt();
		input.close();
		
		if (veza==2)
		{
			Ce=C1+C2;
			System.out.println("Paralelna veza. Ce: " + Ce);
		}
		else if (veza==1)
		{
			Ce=C1*C2/(C1+C2);
			System.out.println("Redna veza. Ce: " + Ce);
		}
		else
			System.out.println("Pogresan unos. ");
	}

}
