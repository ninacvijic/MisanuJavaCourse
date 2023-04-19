package granula.nina;
import java.io.*;
import java.text.*;
public class Primer7 {

	public static void main(String[] args) throws Exception {
		
DecimalFormat df = new DecimalFormat("#.###");
BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

//Inicijalizacija promenljivih p i q 
double p = 1, q = 1; 

// Unos vrednosti promenljive n 
System.out.print("Unesite vrednost za n: ");
int n = Integer.parseInt(ulaz.readLine()); 

// Izračunavanje vrednosti proizvoda 
for (int i = 2; i <= n; i++)
{
	q *= i;         // izracunavanje faktorijala  // q! 
	p *= (1 + 1 / q); 
	}   

// Štampanje izlaznog rezultata 
System.out.println("Dobijena vrednost proizvoda je " + df.format(p)); 

	}

}
