package nina.nina;
import java.util.Scanner;
public class Zad6B {

	public static void main(String[] args) {
		
     Scanner input = new Scanner(System.in);
		
		double a,b,x;
		System.out.println("Unesite realan broj a: ");
		a= input.nextDouble();
		System.out.println("Unesite realan broj b: ");
		b= input.nextDouble();
		int operacija;
		System.out.println("Unesite vrednost 1 za sabiranje, 2 za oduzimanje, 3 za mnozenje ili 4 za deljenje: ");
		operacija=input.nextInt();
		input.close();
		
	if (operacija==1)
		{
			x= a+b;
			System.out.println("a+b= " + x);
		}
	else if (operacija==2)
		{
			x=a-b;
			System.out.println("a-b= " + x);
		}
	else if (operacija==3)
		{
			x=a*b;
			System.out.println("a*b= " +x);
		}
	else if (operacija==4)
		{
			x=a/b;
			System.out.println("a/b= " +x);
		}
	else
			System.out.println("Pogresan unos. ");
		}
	}


