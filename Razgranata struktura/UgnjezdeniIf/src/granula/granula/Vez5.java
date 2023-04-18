package granula.granula;

import java.util.Scanner;

public class Vez5 {

	public static void main(String[] args) {
		/*
		 * Ovan – od 21. marta do 20. aprila; Bik – od 21. aprila do 21. maja; Blizanci
		 * – od 22. maja do 21. juna; Rak – od 22. juna do 22. jula; Lav – od 23. jula
		 * do 22. avgusta; Devica – od 23. avgusta do 22. septembra; Vaga – od 23.
		 * septembra do 23.oktobra; Škorpija – od 24. oktobra do 22. novembra; Strelac –
		 * od 23. novembra do 21. decembra; Jarac – od 22. decembra do 20. januara;
		 * Vodolija – od 21. januara do 19. februara; Ribe – od 20. februara do 20.
		 * marta;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String mesec;
		int danRodjenja;
		
		System.out.println("Unesite mesec rodjenja: ");
        mesec = sc.nextLine();
        
        if (mesec.equalsIgnoreCase("Januar"))
        {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 20) {
        		System.out.println("Jarac");
        	} else if (danRodjenja >20) {
        		System.out.println("Vodolija");
        	}
        }
        if (mesec.equalsIgnoreCase("Februar")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 18) {
        		System.out.println("Vodolija");
        	} else if (danRodjenja > 18) {
        		System.out.println("Ribe");
        	}
        } if (mesec.equalsIgnoreCase("Mart")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 20) {
        		System.out.println("Ribe");
        	} else if (danRodjenja > 20) {
        		System.out.println("Ovan");
        	}
        } if (mesec.equalsIgnoreCase("April")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 20) {
        		System.out.println("Ovan");
        	} else if (danRodjenja > 20) {
        		System.out.println("Bik");
        	}
        } if (mesec.equalsIgnoreCase("Maj")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 21) {
        		System.out.println("Bik");
        	} else if (danRodjenja > 21) {
        		System.out.println("Blizanci");
        	}
        }if (mesec.equalsIgnoreCase("Jun")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 21) {
        		System.out.println("Blizanci");
        	} else if (danRodjenja > 21) {
        		System.out.println("Rak");
        	}
        }  if (mesec.equalsIgnoreCase("Jul")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 22) {
        		System.out.println("Rak");
        	} else if (danRodjenja > 22) {
        		System.out.println("Lav");
        	}
        } if (mesec.equalsIgnoreCase("Avgust")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 22) {
        		System.out.println("Lav");
        	} else if (danRodjenja > 22) {
        		System.out.println("Devica");
        	}
        } if (mesec.equalsIgnoreCase("Septembar")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 22) {
        		System.out.println("Devica");
        	} else if (danRodjenja > 22) {
        		System.out.println("Vaga");
        	}
        } if (mesec.equalsIgnoreCase("Oktobar")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 24) {
        		System.out.println("Vaga");
        	} else if (danRodjenja > 24) {
        		System.out.println("Skorpija");
        	}
        }  if (mesec.equalsIgnoreCase("Novembar")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 22) {
        		System.out.println("Skorpija");
        	} else if (danRodjenja > 22) {
        		System.out.println("Strelac");
        	}
        } if (mesec.equalsIgnoreCase("Decembar")) {
        	System.out.println("Unesite dan rodjenja: ");
        	danRodjenja = sc.nextInt();
        	if (danRodjenja >= 1 && danRodjenja <= 21) {
        		System.out.println("Strelac");
        	} else if (danRodjenja > 21) {
        		System.out.println("Jarac");
        	}
        }
        
        sc.close();   
	}

}
