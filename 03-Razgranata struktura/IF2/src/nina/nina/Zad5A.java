package nina.nina;
import java.util.Scanner;
public class Zad5A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		double C1, C2, Ce;
		
		System.out.println("Unesite kapacitet kondenzatora C1: ");
		C1= input.nextDouble();
		System.out.println("Unesite kapacitet kondenzatora C2");
		C2= input.nextDouble();
		
		int veza; // sluzi za izbor redne ili paralelne veze
		System.out.println("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu");
		veza=input.nextInt();
		
		input.close();
		
		switch (veza)
		{
		case 2:
		{
			Ce=C1+C2;
			System.out.println("Ekvivalentni kapacitet paralelne veze Ce iznosi: " + Ce);
			break;
		}
		case 1:
		{
			Ce=C1*C2/(C1+C2);
			System.out.println("Ekvivalentni kapacitet redne veze Ce iznosi: " + Ce);
			break;
		}
		default:
			System.out.println("Nepostojeca mogucnost. ");
		}
		
		}
		
		
	}


