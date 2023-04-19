package cvija;

public class EnumPrikaz { // ovde cemo obraditi vrednosti iz Enuma
	
	static void odgovor(Odgovori odg) {  // argument je ovo u ovoj zagradi(), tog tipa je
		
		switch(odg) {
		case NE:
			System.out.println("Ne");
			break;
		case DA:
			System.out.println("Da");
			break;
		case MOZDA:
			System.out.println("Mozda");
			break;
		case NIKAD:
			System.out.println("Nikad");
			break;
		case USKORO:
			System.out.println("Uskoro");
			break;
		case KASNIJE:
			System.out.println("Kasnije");
			break;
		}
		
	}

}
