package cvija;

public class Zad_6 {

	// Napisati program koji pretvara dekadni broj {0,1,2,3,4,5,6,7,8,9} u
	// binarni{0,1}.

	public static void main(String[] args) {

		System.out.println("dekadni\tbinarni");
		for (int i = 0; i <= 9; i++) {
			String b = Integer.toBinaryString(i);
			System.out.println(i + "\t" + b);
		}
	}
}
