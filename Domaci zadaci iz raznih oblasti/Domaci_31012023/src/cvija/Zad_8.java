package cvija;

import java.util.Scanner;

public class Zad_8 {
	
  // Koristeći rekurzivan postupak izračunati sumu svih cifara unetog broja. 

	public static int sumaRekurz(int br) {
		if(br == 0) {
			return 0;
			}
		int s = br % 10;
		return s +sumaRekurz(br / 10);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int a = sc.nextInt();
		
		int suma = sumaRekurz(a);
		System.out.println("Suma cifara unetog broja iznosi: " + suma);

		sc.close();
	}

}
