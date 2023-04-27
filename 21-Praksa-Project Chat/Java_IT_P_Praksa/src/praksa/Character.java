package praksa;

public class Character {

	private String ordinal; // podaci
	private String name;
	private String allegiance;
	private String messagesFile;
	private int numMessages; // dodano za brojanje poruka svakog karaktera

	public Character(String ordinal, String name, String allegiance, String messagesFile) { // konstruktor
		this.ordinal = ordinal;
		this.name = name;
		this.allegiance = allegiance;
		this.messagesFile = messagesFile;
	}

	public String getOrdinal() { // geteri
		return ordinal;
	}

	public String getName() {
		return name;
	}

	public String getAllegiance() {
		return allegiance;
	}

	public String getMessagesFile() {
		return messagesFile;
	}

	public int getNumMessages() {
		return numMessages;
	}

	public void setNumMessages(int numMessages) { // metoda za odredjivanje broja poruka
		this.numMessages = numMessages - 1; // jer je pod brojem 1 ime-nadimak osobe koja salje
	}

}

   


  

     
            
   
              
