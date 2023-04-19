package cvija;

public class Main {

	public static void main(String[] args) {
		
	//	OkreniString os = () -> {    }   // opsti oblik!
		
		OkreniString os = (str) -> {
			String rezultat = ""; // ovde cemo smestiti konacan rezultat, cuvamo ovako mesto  // za sad ostavimo prazno!
			
			for(int i = str.length() - 1; i >= 0; i--)  // moglo i preko ListIteratora, ali mi idemo peske, standardnom for petljom
				                           // u for petlji idemo od poslednjeg indeksa do nultog
				rezultat += str.charAt(i);          // izdvajamo ovako znakove // str je proizvoljan naziv naseg Stringa  // i je pozicija indeksa
			return rezultat;    // sad smestamo u rezultat
		};  // lambda telo u {} obavezno zavrsiti sa ; iza zatvorene viticaste zagrade!!!
		
		System.out.println("12345  " + os.okreniString("12345"));
		System.out.println("Java obrnuto: " + os.okreniString("Java"));

	}

}
