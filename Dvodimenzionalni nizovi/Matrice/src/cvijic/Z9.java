package cvijic;


public class Z9 {

	public static void main(String[] args) {
		
		int red = 5;
		int kolona = 5;
		int a[][] = new int[red][kolona]; 

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				a [i][j] = 1;
			}
		}
		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Elementi na glavnoj i ispod glavne dijagonale matrice: ");
		for (int i = 0; i < red; i++) {  
			for (int j = 0; j < kolona; j++) {
				if(i >= j) {
					System.out.print(a[i][j] + " ");
				}
			}	
			System.out.println();
		}
		
}
}
