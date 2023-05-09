package cvija;

public class Linear_Search_1 {
	
	/*
	 * Linearna pretraga se koristi za pretraživanje kljucnog(key) elementa iz više elemenata.
	 * Linearna pretraga se danas manje koristi jer je sporija od binarne pretrage.
	 * 
	 * Linearna pretraga se koristi za:
	 * • za pretragu elementa u manjem nizu
	 * • za brzo pretraživanje
	 * 
	 * Algoritam:
	 * Korak 1: Pređite niz
	 * Korak 2: Uparite ključni element sa elementom niza
	 * Korak 3: Ako je ključni element pronađen, vratite poziciju indeksa elementa niza
	 * Korak 4: Ako ključni element nije pronađen, vratite -1
	 */
	
	//  Primer linearne pretrage u Javi gde se pretražuje ​​element sekvencijalno iz niza
	
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;
		System.out.println(key + " is found at index: " + linearSearch(a1, key));

	}

}
