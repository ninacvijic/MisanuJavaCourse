package cvija;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Regex {  // Regular expressions

	public static void main(String[] args) {
		
		/*
		 * Regularni izraz je niz znakova koji formira obrazac pretraživanja.
		 * Regularni izrazi se mogu koristiti za izvođenje svih vrsta operacija pretraživanja i zamjene teksta.
		 * I primjenjuje se na tekst s lijeva na desno. 
		 * Jednom kada se znak upotrebi u podudaranju, ne može se ponovo koristiti.
		 * 
		 * Pattern Class - definise pattern(uzorak) koji ce se koristiti u pretrazivanju
		 * Matcher Class - koristi se za trazenje uzorka
		 * PatternSyntaxException Class - ukazuje na sintaksičku grešku u obrascu regularnog izraza
		 * 
		 * Pravila pisanja regularnih izraza:
		 * Npr: . (tačka) je jedan primjer za regularni izraz. 
		 * Tačka odgovara bilo kojem pojedinačnom znaku; odgovaralo bi, npr za "a" ili "1".
		 * 
		 * Meta characters imaju unaprijed definisano značenje i olakšavaju korištenje određenih uobičajenih obrazaca. 
		 * Npr, može se koristiti \d (any digit) kao pojednostavljena definicija za [0..9].
		 * 
		 * Quantifier definise koliko često se element može pojaviti. Simboli ?, *, + i {} su kvalifikatori.
		 * Možete grupisati dijelove vašeg regularnog izraza. U svom uzorku grupišete elemente sa okruglim zagradama, npr. (). 
		 * Ovo vam omogućava da dodijelite operator ponavljanja cijeloj grupi. 
		 * Preko $ možete uputiti na grupu. $1 je prva grupa, $2 druga, itd.
		 * 
		 * Stringovi imaju četiri ugrađene metode za regularne izraze: 
		 * * matches(), * split(), * replaceFirst() * replaceAll()
		 */
		
		String rec = "java";
		String tekst = "Java je programski jezik.";
		
		System.out.println("Da li se rec java nalazi u datoj recenici?  \nRecenica: Java je programski jezik.");
		Pattern pattern = Pattern.compile(rec, Pattern.CASE_INSENSITIVE);  // compile() - prvo sta trazim, drugo flag kakva pretraga treba biti(opciono)
		Matcher matcher = pattern.matcher(tekst);  // matcher() - metoda
		boolean matchFound = matcher.find();  // find()
		if (matchFound) {
			System.out.println("Da");
		} else {
			System.out.println("Ne");
		}
		
		System.out.println("Da li se u istoj recenici nalazi java napisana malim slovom?");
		boolean rezultat = matcher.matches();  //ovde nemam flag
		System.out.println(rezultat);
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Novi primer:\nOvo je moj racunar.");
		String example = "Ovo je moj racunar.";
		System.out.println("Da li primer odgovara uslovu? : " + example.matches("\\w.*"));
		System.out.println("Broj reci:");
        String[] splitString = (example.split("\\s+"));
        System.out.println(splitString.length);
        System.out.println("Reci poredane jedna ispod druge: ");
        for (String string : splitString) {
            System.out.println(string);
        }
        System.out.println("Umesto space-a tab:");
        System.out.println(example.replaceAll("\\s+", "\t")); // zamijeni sve whitespace-ove sa tabs

		System.out.println("----------------------------------------------------------------------------");
		String s = "Bratislava";
		System.out.println("Da li String: " + s + " sadrzi 3 slova?");
		boolean b = s.matches("[a-zA-Z]{3}"); // pojednostavljen izraz od ("[a-Z][a-Z][a-Z]")
		System.out.println(b);
		
		System.out.println("----------------------------------------------------------------------------");
        System.out.println("Primer - Da li broj 253 ima tri cifre?");
    	String br = "253";
		boolean b2 = br.matches("\\d{3}");
		System.out.println(b2);

		System.out.println("----------------------------------------------------------------------------");
	    String s1 = "This is my small example string.";
	    System.out.println(s1);
	    Pattern pt = Pattern.compile("\\w+");
		Matcher mt = pt.matcher(s1);
		while (mt.find()) {
			System.out.print("Pocetni indeks: " + mt.start()); // start()
			System.out.print(" Zavrsni indeks: " + mt.end() + " "); // end()
			System.out.println(mt.group()); // group()
		}

		Pattern replace = Pattern.compile("\\s+");
		Matcher mt2 = replace.matcher(s1);
		System.out.println(mt2.replaceAll("\t")); // zamijeni sve whitespace-ove sa tabs

	}

}
