package cvijic.nina;

public class V12 {

	public static void main(String[] args) {
		
		int brojBrojevaDjeljivihSa3 = 0; 
		
		for (int x = 1; x <= 20; x++)
		{
			if (x % 3 == 0)
			{
				brojBrojevaDjeljivihSa3++;
			}
		}
		System.out.println(brojBrojevaDjeljivihSa3);
	}

}
