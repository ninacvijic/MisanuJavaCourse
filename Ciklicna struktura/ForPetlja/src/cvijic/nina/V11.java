package cvijic.nina;

public class V11 {

	public static void main(String[] args) {


		//int n;  // broj sastavljen od s, d i j

		int s, d, j;
		
		for (int n = 0; n < 1000; n++)
		//for (int x = 0; x < 1000; x++)
		{
			//n = x;
			
			s = n / 100;
			d = (n % 100) / 10;
		    j = n % 10;
			
			if (n == (s*s*s + d*d*d + j*j*j))
			{
				System.out.println("Broj " + n + " je Armstrongov broj!");
			}
		}

	}

}
