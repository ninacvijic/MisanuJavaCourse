package granula.granula;

import java.util.Scanner;

public class Vez4a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan, mesec, godina, noviDan, noviMesec, novaGodina;
		System.out.println("Uneti Dan \nMesec \ni Godinu\r");
		dan = sc.nextInt();
		mesec = sc.nextInt();
		godina = sc.nextInt();
		
	sc.close();
	
	int limit = 0;
	
	switch (mesec) {
	case 4: case 6: case 9: case 11:
		limit = 30;
		break;
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		limit = 31;
		break;
	case 2:
		if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
			limit = 29;
		} else {
			limit = 28;
		}
		break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + mesec);
	}
	
	 noviDan = dan + 7;
	 noviMesec = mesec;
	 novaGodina = godina;
	 
	 if (noviDan > limit) {
		 noviDan = noviDan % limit;
		 noviMesec = mesec + 1;
		 if (noviMesec == 13) {
			 noviMesec = 1;
			 novaGodina = godina + 1;
		 }
	 }
	 
	System.out.println("Za 7 dana bice: " + noviDan + "." + noviMesec + "." + novaGodina);
	}

}
