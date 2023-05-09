package cvija;

public class Fibonacci_Search_1 {
	
	/*
	 * Dat je sortirani niz arr[] veličine n i element x koji se traži u njemu.
	 * Vrati indeks od x ako je prisutan u nizu, inače vraća -1.
	 * 
	 * Fibonačijeva pretraga je tehnika zasnovana na poređenju koja koristi Fibonačijeve brojeve 
	 * za pretragu elementa u sortiranom nizu.
	 * 
	 * Sličnosti s binarnim pretraživanjem:
	 * radi za sortirane nizove, algoritam "Zavadi pa vladaj", ima Log n vremensku složenost.
	 * 
	 * Razlike sa binarnim pretraživanjem:
	 * Fibonačijeva pretraga deli dati niz na nejednake delove; 
	 * Binarno pretraživanje koristi operator deljenja za podelu raspona. Fibonačijeva pretraga ne koristi /, 
	 * ali koristi + i -. Operator podele može biti skup na nekim CPU-ima;
	 * Fibonačijeva pretraga ispituje relativno bliže elemente u narednim koracima.Dakle, kada je ulazni niz velik
	 * i ne može stati u CPU keš ili čak u RAM, Fibonacci pretraga može biti korisna.
	 */

	public static int min(int x, int y) // korisna funkcija za pronalazenje minimuma od 2 elementa
	{
		return (x <= y) ? x : y;
	}
	
	public static int fibMonaccianSearch(int arr[], int x, int n) {  // vraća indeks od x ako je prisutan, inače vraća -1
		/* inicijalizacija Fibonačijevih brojeva*/
		int fibMMm2 = 0; // (m-2) Fibonacci br.
		int fibMMm1 = 1; // (m-1) Fibonacci br.
		int fibM = fibMMm2 + fibMMm1; // m-ti Fibonacci

		/* fibM će pohraniti najmanji Fibonačijev broj veći ili jednak n */
		while (fibM < n) {
			fibMMm2 = fibMMm1;
			fibMMm1 = fibM;
			fibM = fibMMm2 + fibMMm1;
		}

		int offset = -1;  // Označava eliminisani raspon od spreda

		/* dok ima elemenata koje treba pregledati. Imajte na umu da poredimo arr[fibMm2] sa x. Kada fibM postane 1, fibMm2 postaje 0 */
		while (fibM > 1) {
			int i = min(offset + fibMMm2, n - 1);  // proverite je li fibMm2 važeća lokacija

			/* Ako je x veći od vrednosti na indeksu fibMm2, izrežite niz podniza od offseta do i */
			if (arr[i] < x) {
				fibM = fibMMm1;
				fibMMm1 = fibMMm2;
				fibMMm2 = fibM - fibMMm1;
				offset = i;
			}

			/* Ako je x manji od vrednosti na indeksu fibMm2, izrežite podniz nakon i+1 */
			else if (arr[i] > x) {
				fibM = fibMMm2;
				fibMMm1 = fibMMm1 - fibMMm2;
				fibMMm2 = fibM - fibMMm1;
			}

			else   
				return i;    // element nadjen. vrati indeks 
		}

		if (fibMMm1 == 1 && arr[n - 1] == x)  // poredjenje zadnjeg elementa sa x
			return n - 1;

		return -1;  // element nije pronadjen. vrati -1
	}

	public static void main(String[] args) {

		int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235 };
		int n = 12;
		int x = 235;
		int ind = fibMonaccianSearch(arr, x, n);
		if (ind >= 0)
			System.out.print("Found at index: " + ind);
		else
			System.out.print(x + " isn't present in the array");

	}

}
