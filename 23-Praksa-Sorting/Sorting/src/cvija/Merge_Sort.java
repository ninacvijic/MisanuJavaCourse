package cvija;

public class Merge_Sort {
	
	/*
	 * Sortiranje spajanjem koristi pristup "zavadi pa vladaj" za sortiranje elemenata. 
	 * To je jedan od najpopularnijih i najefikasnijih algoritama za sortiranje. 
	 * Ono deli datu listu na dve jednake polovine, poziva sebe na dve polovine i zatim spaja dve sortirane polovine.
	 * Moramo definisati funkciju merge() da izvršimo spajanje.
	 * Podliste se iznova dele na pola dok se lista ne može dalje deliti.
	 * Zatim kombinujemo par lista jednog elementa u liste sa dva elementa, sortirajući ih u procesu.
	 * Sortirani parovi od dva elementa se spajaju u liste sa četiri elementa, i tako sve dok ne dobijemo sortiranu listu.
	 * 
	 * Algoritam:
	 * MERGE_SORT(arr, beg, end)  //beg-pocetni element, end-zadnji element niza, merge-funkcija za spajanje
	 * if beg < end  
	 * set mid = (beg + end)/2    // mid-sredina
	 * MERGE_SORT(arr, beg, mid)    //prvi sortirani podniz
	 * MERGE_SORT(arr, mid + 1, end)   // drugi sortirani podniz
	 * MERGE (arr, beg, mid, end)     // spaja dva podniza kako bi se napravio jedan sortirani niz
	 * end of if  
	 * END MERGE_SORT  
	 * 
	 * Merge Sort je popularan izbor za sortiranje velikih skupova podataka jer je relativno efikasno i lako za implementaciju.
	 * Medjutim ovo spajanje zahteva dodatni prostor za pohranjivanje elemenata.
	 * Koristi se za: sortiranje velikih skupova podataka, eksterno sortiranje, paralelnu obradu, stabilno sortiranje, prilagodjeno sortiranje.
	 * Prednosti: stabilnost, zagarantovani učinak u najgorem slučaju, parallelizable, efikasna memorija, svestranost, prilagodljivost.
	 * Nedostaci: složenost prostora(Merge Sort zahteva dodatnu memoriju za pohranjivanje spojenih podnizova tokom procesa sortiranja),
	 * rekurzivni algoritam(Merge Sort je rekurzivni algoritam, koji može rezultovati velikim brojem poziva funkcija i 
	 * korištenjem steka za vrlo velike skupove podataka. Ovo može uzrokovati greške prekoračenja steka ili druge probleme s performansama),
	 * nije na mestu(Merge Sort nije algoritam za sortiranje na mestu, što znači da zahteva dodatnu memoriju za pohranjivanje sortiranih podataka),
	 * nije uvek optimalno za male skupove podataka, složenost implementacije.
	 */
	
	void merge(int a[], int beg, int mid, int end) {  // funkcija za spajanje podnizova od a[]   // implementacija MERGE funkcije
		int i, j, k;
		int n1 = mid - beg + 1;
		int n2 = end - mid;

		int LeftArray[] = new int[n1];  // privremeni nizovi
		int RightArray[] = new int[n2];

		for (i = 0; i < n1; i++)    // kopirati podatke u privremene nizove
			LeftArray[i] = a[beg + i];
		for (j = 0; j < n2; j++)
			RightArray[j] = a[mid + 1 + j];

		i = 0; // početni indeks prvog podniza
		j = 0; // početni indeks drugog podniza
		k = beg; // početni indeks spojenog(merged) podniza 

		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				a[k] = LeftArray[i];
				i++;
			} else {
				a[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}
	
	void mergeSort(int a[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(a, beg, mid);
			mergeSort(a, mid + 1, end);
			merge(a, beg, mid, end);
		}
	} 
	
	void printArray(int a[], int n) {  // metoda za stampanje niza
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {

		int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
		int n = a.length;
		Merge_Sort m1 = new Merge_Sort();
		System.out.println("Niz pre Merge Sort-a: ");
		m1.printArray(a, n);
		m1.mergeSort(a, 0, n - 1);
		System.out.println("\nNiz posle Merge Sort-a:  ");
		m1.printArray(a, n);
		System.out.println("");

	}

}
