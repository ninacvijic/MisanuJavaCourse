package cvija;

public class Selection_Sort {

	/*
	 * Možemo kreirati java program za sortiranje elemenata niza koristeći sortiranje selekcijom.
	 * U algoritmu Selection Sort tražimo najniži element i raspoređujemo ga 
	 * na odgovarajuću lokaciju. Trenutni element menjamo sledećim najmanjim brojem.
	 * 
	 * Algoritam radi na vrlo jednostavan način. Održava dva podniza za dati niz.
	 * Prvi podniz je već sortiran. A drugi podniz nije sortiran.
	 * Sa svakom iteracijom Selection Sorta, element se bira iz nesortiranog podniza i premešta u sortirani podniz.
	 * 
	 * Kako Selection Sort radi:
	 * arr[] = 25 35 45 12 65 10
	 * Pronađite minimalni element u arr[0...5] i postavite ga na početak:
	 * 10 25 35 45 12 65
	 * Pronađite minimalni element u arr[1...5] i postavite ga na početak arr[1...5]:
	 * 10 12 25 35 45 65
	 * Pronađite minimalni element u arr[2...5] i postavite ga na početak arr[2...5]:
	 * Ne, možete videti da je niz već sortiran.
	 * 10 12 25 35 45 65
	 * 
	 * Dobro radi sa malim skupovima podataka i prilagodljiv je različitim tipovima podataka.
	 * Selection Sort je algoritam za sortiranje na mestu, što znači da ne zahteva nikakvu dodatnu memoriju za sortiranje liste.
	 * Pogodan je za sortiranje podataka sa nekoliko jedinstvenih ključeva, jer dobro radi u takvim scenarijima.
	 * 
	 * Selection Sort ne radi dobro na velikim skupovima podataka.
	 * Algoritam mora iterirati preko liste više puta, tako da može dovesti do neuravnotežene grane.
	 * Nije prilagodljiv, što znači da ne koristi činjenicu da je lista možda već sortirana ili djelimično sortirana.
	 * To nije sortiranje za poređenje i nema nikakve garancije performansi kao što je Merge Sort ili Quick Sort.
	 * Ima loše performanse cache memorije.
	 */
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;  // trazenje najmanjeg indeksa
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	public static void main(String[] args) {

		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Niz pre Selection Sort-a: ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		selectionSort(arr1);  // sortiranje niza koristeci Selection Sort

		System.out.println("Niz posle Selection Sort-a:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}

	}

}
