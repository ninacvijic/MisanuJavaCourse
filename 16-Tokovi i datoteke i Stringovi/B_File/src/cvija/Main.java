package cvija;

import java.io.File;

public class Main {  

	public static void main(String[] args) {
		                                              
	//	File f = new File("C:\\Users\\Cvijic.DESKTOP-2LFJTOO\\Desktop\\ws2\\B_File\\nina.java"); // pravimo novi fajl, pod " " ide putanja, dodati na kraju naziv filea ovde je to nina.java(toga nema u Properties)
		
		File f = new File("D:/cvija.java");  // fajl napravila u Notepadu, sacuvala ga na D-u //obavezno .txt promeniti u All Files kad pamtim
		               // f je objekat klase File                                                                       
	System.out.println("Fajl: " + f.getName() + (f.isFile() ? "  je fajl " : " nije fajl!")); // ternarni operator - da li je file ? ako jeste pisace je file a ako nije nije file!
	System.out.println("Apsolutna putanja: " + f.getAbsolutePath());
	System.out.println(f.exists() ? "Fajl postoji " : "Fajl ne postoji!");
	System.out.println(f.isDirectory() ? "Direktorijum" : "Fajl") ;
	System.out.println(f.canRead() ? "Fajl moze biti procitan" : "Fajl ne moze biti procitan!");
	System.out.println(f.canWrite() ? "Omoguceno je upisivanje" : "Nije omoguceno upisivanje!");
	System.out.println("Velicina: " + f.length()); // Nula nam je jer nista nismo upisali, a prof jeste kod sebe, pa mu je 16.
	System.out.println("Poslednja promena fajla: " + f.lastModified());  // u milisekundama
	}

}
