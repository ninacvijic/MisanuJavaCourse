package cvijic.nina;
import java.util.Scanner;

public class PretvoriSekunde {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite sate: ");
		int s = input.nextInt();
		System.out.println("Unesite minute: ");
		int m = input.nextInt();
		System.out.println("Unesite sekunde: ");
		int sec = input.nextInt();
		
		System.out.print("Vreme izraženo u sekundama je: " + (s * 3600 + m * 60 + sec));
	}

}
