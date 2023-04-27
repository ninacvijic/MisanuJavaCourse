package praksa;
	
	public enum EmojiType { // definisanje 3 vrste emotikona
     	HAPPY("😄|🙂|😊|😍"),
		SAD("😢|😭|😞|👿"),
		LOVING("😍|😘");

		private String emojiRegex;

		EmojiType(String emojiRegex) {  // konstruktor
			this.emojiRegex = emojiRegex;
		}

		public String getEmojiRegex() {
			return emojiRegex;
		}
	}



