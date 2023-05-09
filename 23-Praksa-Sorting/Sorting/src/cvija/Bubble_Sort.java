package cvija;

public class Bubble_Sort {
	
	/*
	 * Mozemo kreirati java program za sortiranje elemenata niza koristeci sortiranje "mehuricima".
	 * Algoritam Bubble Sort poznat je kao najjednostavniji algoritam sortiranja.
	 * 
	 * U algoritmu Bubble Sort, niz se prelazi od prvog do poslednjeg elementa.
	 * Ovde se trenutni element upoređuje sa sledećim elementom. 
	 * Ako je trenutni element veći od sledećeg, zamenjuje se.
	 * 
	 * Ovakvo sortiranje ne zahteva nikakav dodatni memorijski prostor.
	 * To je stabilan algoritam za sortiranje, 
	 * što znači da elementi sa istom vrednošću ključa održavaju svoj relativni poredak u sortiranom izlazu.
	 * 
	 * Ovaj algoritam nije prikladan za velike skupove podataka jer je njegova prosečna
	 * i vremenska složenost u najgorem slučaju prilično visoka.
	 * Nije efikasan za velike skupove podataka, jer zahteva višestruke prolaze kroz podatke.
	 */
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// zamena elemenata
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Niz pre Bubble Sort-a: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);  // sortiranje elemenata niza koristeci Bubble Sort

		System.out.println("Niz posle Bubble Sort-a: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
