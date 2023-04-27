package praksa;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String characterData = FileHelper.loadMetaData(); // ucitavanje karaktera iz got_meta_data.txt

		System.out.println("**1.Data for each character:**");
		String[] lines = characterData.split(System.lineSeparator());
		List<Character> characters = new ArrayList<>(); // lista za karaktere

		for (int i = 1; i < lines.length; i++) { // Start od indeksa 1 da se preskoci uvodno(naslovno) polje
			String line = lines[i];
			String[] data = line.split(",");
			if (data.length == 3) {
				String ordinal = Integer.toString(i); // redni broj osobe, kao String
				String name = data[0].trim();
				String allegiance = data[1].trim();
				String messagesFile = data[2].trim();
				Character character = new Character(ordinal, name, allegiance, messagesFile); // kreiranje objekta
				characters.add(character);
				System.out.println("Character: " + ordinal);
				System.out.println("Name: " + character.getName());
				System.out.println("Allegiance: " + character.getAllegiance());
				System.out.println("Messages File: " + character.getMessagesFile());
				System.out.println();
			}
		}

		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("**2.All messages of the character Daenerys:**");
		String messagesFile = null; // prva pojava messagesFile-a
		for (Character character : characters) {
			if (character.getName().equalsIgnoreCase("Daenerys Stormborn")) { // pretraga za osobom Daenerys Stormborn
				messagesFile = character.getMessagesFile();
				break; // napustiti petlju nakon sto nadjem Daenerys Stormborn
			}
		}
		// ispisivanje poruka iz datoteke poruka Daenerys Stormborn
		if (messagesFile != null) {
			List<String> messages = FileHelper.loadMessages(messagesFile);
			if (!messages.isEmpty()) {
				for (String message : messages) {
					System.out.println(message);
				}
			} else {
				System.out.println("No messages found for Daenerys Stormborn. " + messagesFile);
			}
		} else {
			System.out.println("Character Daenerys Stormborn is not found.");
		}
		System.out.println();

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("**3.Number of messages sent by each Character:**");

		for (Character character : characters) {
			int numMessages = 0;
			String messagesFile2 = character.getMessagesFile(); // druga pojava messagesFile-a

			if (messagesFile2 != null) {
				List<String> messages = FileHelper.loadMessages(messagesFile2);
				for (String message : messages) {
					if (!message.trim().isEmpty()) { // da se preskoce prazni redovi u porukama
						numMessages++;
					}
				}
			}
			character.setNumMessages(numMessages);
			System.out.println("Character: " + character.getOrdinal());
			System.out.println("Name: " + character.getName());
			System.out.println("Number of Messages: " + character.getNumMessages());
			System.out.println();
		}

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("**4.Character analysis-counting their use of Emojis:**");
		EmojiAnalyzer emojiAnalyzer = new EmojiAnalyzer(); // objekat klase EmojiAnalyzer

		for (Character character : characters) { // petlja kroz karaktere i analiziranje upotrebe emotikona u njihovim porukama
			String messagesFile3 = character.getMessagesFile(); // treca pojava messagesFile-a

			if (messagesFile3 != null) {
				List<String> messages = FileHelper.loadMessages(messagesFile3); // učitavanje poruka iz datoteke
		
				int numEmojisHappy = emojiAnalyzer.countEmojis(messages, EmojiType.HAPPY); // brojanje HAPPY emotikona
		        int numEmojisSad = emojiAnalyzer.countEmojis(messages, EmojiType.SAD);  // brojanje SAD
				
				System.out.println("Name: " + character.getName());
				System.out.println("HAPPY Emojis: " + numEmojisHappy);
				System.out.println("SAD Emojis: " + numEmojisSad);
				System.out.println("Disposition: " + emojiAnalyzer.getDisposition(numEmojisHappy, numEmojisSad));
				System.out.println();
			} else {
				System.out.println("No messages found for analysis.");
			}
		}
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("**5.Character that has the most positive and character that has the most negative disposition:**");
		Character characterWithMostHappyEmojis = null;
		Character characterWithMostSadEmojis = null;
		int maxHappyEmojis = Integer.MIN_VALUE;
		int maxSadEmojis = Integer.MIN_VALUE;

		for (Character character : characters) {
			String messagesFile4 = character.getMessagesFile();
			List<String> messages = FileHelper.loadMessages(messagesFile4);

			int numEmojisHappy = emojiAnalyzer.countEmojis(messages, EmojiType.HAPPY);
			int numEmojisSad = emojiAnalyzer.countEmojis(messages, EmojiType.SAD);

			if (numEmojisHappy > maxHappyEmojis) {
				maxHappyEmojis = numEmojisHappy;
				characterWithMostHappyEmojis = character;
			}
			if (numEmojisSad > maxSadEmojis) {
				maxSadEmojis = numEmojisSad;
				characterWithMostSadEmojis = character;
			}
		}
		
		System.out.println("Name: " + characterWithMostHappyEmojis.getName());
		System.out.println("Number of Happy Emojis: " + maxHappyEmojis);
		System.out.println();
	
		System.out.println("Name: " + characterWithMostSadEmojis.getName());
		System.out.println("Number of Sad Emojis: " + maxSadEmojis);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("**6.Does Jon love Daenerys more than she loves him?**");
		
		Character daenerys = characters.get(0); // biram Jona i Daenerys iz liste karaktera
		Character jon = characters.get(1);  
		
		List<String> jonMessages = FileHelper.loadMessages(jon.getMessagesFile());
		List<String> daenerysMessages = FileHelper.loadMessages(daenerys.getMessagesFile());

		int numEmojisLovingFromJon = emojiAnalyzer.countEmojisLoving(jonMessages);
		int numEmojisLovingFromDaenerys = emojiAnalyzer.countEmojisLoving(daenerysMessages);

		if (numEmojisLovingFromJon > numEmojisLovingFromDaenerys) {
			System.out.println("Jon loves Daenerys more!!!");
			System.out.println("Jon sent " + numEmojisLovingFromJon + " LOVING emojis to Daenerys.");
			System.out.println("Daenerys sent " + numEmojisLovingFromDaenerys + " LOVING emojis to Jon.");
		} else if (numEmojisLovingFromJon < numEmojisLovingFromDaenerys) {
			System.out.println("Daenerys loves Jon more!!!");
			System.out.println("Jon sent " + numEmojisLovingFromJon + " LOVING emojis to Daenerys.");
			System.out.println("Daenerys sent " + numEmojisLovingFromDaenerys + " LOVING emojis to Jon.");
		} else {
			System.out.println("Jon and Daenerys love each other equally!!!");
			System.out.println("Jon sent " + numEmojisLovingFromJon + " LOVING emojis to Daenerys.");
			System.out.println("Daenerys sent " + numEmojisLovingFromDaenerys + " LOVING emojis to Jon.");
		}

	}
}

    














         
   



    
  
   



                
             

               
     

               

            
                
 










   

        

        






		      






        

    
      
  

