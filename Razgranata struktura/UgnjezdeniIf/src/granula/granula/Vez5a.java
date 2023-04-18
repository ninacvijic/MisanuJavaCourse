package granula.granula;

import java.util.Scanner;

public class Vez5a {

	public static void main(String[] args) {
		/*
		 * Ovan – od 21. marta do 20. aprila;
		 * Bik – od 21. aprila do 21. maja;
		 * Blizanci – od 22. maja do 21. juna;
		 * Rak – od 22. juna do 22. jula;
		 * Lav – od 23. jula do 22. avgusta;
		 * Devica – od 23. avgusta do 22. septembra;
		 * Vaga – od 23. septembra do 23.oktobra;
		 * Škorpija – od 24. oktobra do 22. novembra;
		 * Strelac – od 23. novembra do 21. decembra;
		 * Jarac – od 22. decembra do 20. januara;
		 * Vodolija – od 21. januara do 19. februara;
		 * Ribe – od 20. februara do 20. marta;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String mesec;
		int dan;
		
		System.out.println("Unesite mesec rodjenja: ");
        mesec = sc.nextLine();
        System.out.println("Unesite dan rodjenja: ");
    	dan= sc.nextInt();
    	
    	sc.close();
        
        if ((mesec.equalsIgnoreCase("Januar") && dan >= 1 && dan <= 20)
        		|| (mesec.equalsIgnoreCase("Decembar") && dan >= 22 && dan <= 31))
        {
        	System.out.println("Jarac");
        } // ... ostali znaci
        else
        {
        	System.out.println("Greska!");
        }
	}

}
