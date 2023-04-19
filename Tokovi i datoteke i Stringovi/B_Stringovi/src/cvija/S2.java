package cvija;

public class S2 {

	public static void main(String[] args) {
		// String s1 = "Vrednost:" + 5 + 5;   // radili prosli put
		// String s2 = "Vrednost:" + (5 + 5);
		// System.out.println(s1);
		// System.out.println(s2 + "\n");
		

		char ch2;
		String s6 = "Januar";
		ch2 = s6.charAt(0);
		System.out.println("Karaker na poziciji 0: " + ch2);
		// Metoda charAt vraca karakter tipa char sa zadate pozicije u stringu.
		// Indeksiranje ide od 0.
		ch2 = "Java".charAt(3);
		System.out.println("Karakter na poziciji 3: " + ch2 + "\n");
		
		
		char ch3[] = { 'J', 'A', 'V', 'A' };
		String s7 = new String(ch3);
		// Duzina stringa dobija se pomocu metode length
		System.out.println("String = " + s7);
		System.out.println("Length = " + s7.length());
		System.out.println("Length = " + "Java programiranje".length()); // broje se i blanko znaci

		
		
		// Metoda equals vrsi leksikografsko poredjenje stringova, pri cemu se pravi razlika izmedju
		// velikih i malih slova. 
		// Vraca true ako su stringovi isti, u suprotnom vraca false.

		// Metoda iqualsIgnoreCase leksikograski poredi stringove, ali ne pravi razliku izmedju malih i velikih slova!

		// Metoda copareTo poziva se kao:
		// s1.compareTo(s2)
		// Vraca 0 ako su s1 i s2 jednaki, negativan broj ako je s1 manji, pozitivan broj ako je s1 veci od s2.  // sta znaci veci/manji??

		// Drzati se ovih metoda za poredjenje stringova, a ne koristiti ==  !!!
		
		// 6.
		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";

		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s10 + " = " + s8.equalsIgnoreCase(s10));

		// 7.
		boolean b;  // za sta mi je ovo?
		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");

		System.out.println(s11 + " equals " + s12 + " = " + s11.equals(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));  // ne mogu se porediti String-ovi sa == !!!
		System.out.println(s11 + " equals " + s13 + " = " + s11.equals(s13)); 
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println(s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));    // zato ovde vraca false !!! paziti!!!
		System.out.println(s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));  // i ovde je false, a true je

		// 8.
		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";
                                        
		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));
	}
}
