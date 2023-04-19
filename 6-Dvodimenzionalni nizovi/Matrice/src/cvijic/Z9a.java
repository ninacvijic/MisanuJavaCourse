package cvijic;

public class Z9a {

	public static void main(String[] args) {
		
		int a[][] = { {1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1} };

		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Elementi na glavnoj i ispod glavne dijagonale matrice: ");
		for (int i = 0; i < 5; i++) {  
			for (int j = 0; j <= i; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println();
			}	
			
	}
	}

