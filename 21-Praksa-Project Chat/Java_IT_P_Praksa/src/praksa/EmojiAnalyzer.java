package praksa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiAnalyzer {

	private Map<String, String> emojiMap;

	public EmojiAnalyzer() {
		this.emojiMap = new HashMap<>();  // HashMap
		for (EmojiType emojiType : EmojiType.values()) {
			emojiMap.put(emojiType.name(), emojiType.getEmojiRegex());
		}
	}
             
	public int countEmojis(List<String> messages, EmojiType emojiType) { // brojanje emotikona u porukama na osnovu tipa emotikona															
		String emojiRegex = emojiType.getEmojiRegex();                    // analiziranje upotrebe emotikona u porukama koristeći regularni izraz
		Pattern pattern = Pattern.compile(emojiRegex);
		int count = 0;
		for (String message : messages) {
			Matcher matcher = pattern.matcher(message);
			while (matcher.find()) {
				count++;
			}
		}
		return count;
	}
	
	public String getDisposition(int numEmojisHappy, int numEmojisSad) {  // dispozicija(provjera da li "SAD" ima pozitivnu dispoziciju (da li je vise srecan ili tuzan))
		if (numEmojisHappy > numEmojisSad) {
			return "More HAPPY";
		} else if (numEmojisHappy < numEmojisSad) {
			return "More SAD";
		} else {
			return "Equal HAPPY and SAD";
		}
	}

	public int countEmojisLoving(List<String> messages) {  // ko koga vise voli 
		String emojiRegex = EmojiType.LOVING.getEmojiRegex();
		Pattern pattern = Pattern.compile(emojiRegex);
		int count = 0;
		for (String message : messages) {
			Matcher matcher = pattern.matcher(message);
			while (matcher.find()) {
				count++;
			}
		}
		return count;
	}
}


  

    
    




