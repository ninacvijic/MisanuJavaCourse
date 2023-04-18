package granula.granula;

import java.util.Scanner;

public class Vez4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan, mesec, godina, noviDan, noviMesec, novaGodina;
		System.out.println("Uneti Dan \nMesec \ni Godinu\r");
		dan = sc.nextInt();
		mesec = sc.nextInt();
		godina = sc.nextInt();
		
	sc.close();
	
	 noviDan = dan + 7;
	 
	 if (noviDan > 30 && (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11))
	 {
		 noviDan = noviDan % 30;
		 noviMesec = mesec + 1;
		 novaGodina = godina;
	 }
	 else if (noviDan > 31 && (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12))
	 {
		noviDan = noviDan % 31;
		noviMesec = mesec + 1;
		if (noviMesec > 12)
		{
			noviMesec = noviMesec % 12;
			novaGodina = godina + 1;
		}
		else
		{
			novaGodina = godina;
		}
	 }
	 else if (noviDan >= 28 && mesec == 2)
	 {
		 if (/*noviDan > 28 && */godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0)
		 {
			 noviDan = noviDan % 29;
			 noviMesec = mesec + 1;
			 novaGodina = godina;
		 }
		 else
		 {
			 noviDan = noviDan % 28;
			 noviMesec = mesec + 1;
			 novaGodina = godina;
		 }
	 }
	 else
	 {
		 noviMesec = mesec;
		 novaGodina = godina;
	 }
	 
	System.out.println("Za 7 dana bice: " + noviDan + "." + noviMesec + "." + novaGodina);
	}

}
