package cvija;

public class Binary_Search_1 {
	
	/*
	 * Binarno pretraživanje se koristi za pretraživanje ključnog(key) elementa iz više elemenata.
	 * Binarno pretraživanje je brže od linearnog pretraživanja.
	 * U slučaju binarnog pretraživanja, elementi niza moraju biti u rastućem redosledu. 
	 * Ako imate nesortirani niz, možete ga sortirati pomoću metode Arrays.sort(arr).
	 * Koristi se i kada su podaci pohranjeni u neprekidnoj memoriji.
	 * I kada podaci nemaju složenu strukturu ili odnose.
	 * 
	 * Binarno pretraživanje je definisano kao algoritam pretraživanja koji se koristi u sortiranom nizu 
	 * uzastopnim deljenjem intervala pretraživanja na pola.
	 * Ideja binarnog pretraživanja je korištenje informacija da je niz sortiran i smanjenje vremenske složenosti.
	 * Za primenu binarnog pretraživanja u bilo kojoj strukturi podataka, struktura podataka mora održavati sledeća svojstva:
	 * Struktura podataka mora biti sortirana.
	 * Pristup bilo kojem elementu strukture podataka traje stalno.
	 */
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);

	}

}
