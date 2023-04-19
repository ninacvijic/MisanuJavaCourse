package cvijic;

public class Z10a {

	public static void main(String[] args) {
		
		int a[][] = { {1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1} }; 

		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Elementi na sporednoj i iznad sporedne dijagonale matrice su: ");
		for (int i = 0; i < 5; i++) {  
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
			}		
	}

}
