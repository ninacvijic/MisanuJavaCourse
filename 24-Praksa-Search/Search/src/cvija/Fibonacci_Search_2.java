package cvija;

public class Fibonacci_Search_2 {
	
	// Pristup 2: Iterativna implementacija
	
	/*
	 * Fibonačijeva pretraga je algoritam pretraživanja koji se koristi za pronalaženje pozicije elementa u sortiranom nizu.
	 * Osnovna ideja iza Fibonaccijeve pretrage je korištenje Fibonaccijevih brojeva za određivanje podeljenih tačaka u nizu 
	 * i izvođenje binarnog pretraživanja na odgovarajućem podnizu.
	 * 
	 * Pošto svaka iteracija Fibonačijeve pretrage zahteva konstantno vreme, ukupna vremenska složenost algoritma je O(log n).
	 * Ovo čini Fibonaccijevo pretraživanje bržim algoritmom od linearne pretrage,
	 * ali sporijim od binarnog pretraživanja i drugih logaritamskih algoritama pretraživanja.
	 */
	
	public static int fibonacciSearch(int[] arr, int x) {
	    int n = arr.length;
	    if (n == 0) {
	      return -1;
	    }
	 
	    int fib1 = 0, fib2 = 1, fib3 = fib1 + fib2; // inicijalizacija Fibonacijevih brojeva
	 
	    while (fib3 < n) {  // pronadji najmanji Fibonacijev broj veci ili jednak n
	      fib1 = fib2;
	      fib2 = fib3;
	      fib3 = fib1 + fib2;
	    }
	 
	    int offset = -1;  // inicijalizacija varijable za trenutnu i prethodnu tačku razdvajanja
	    while (fib3 > 1) {
	      int i = Math.min(offset + fib2, n-1);
	 
	      if (arr[i] < x) {  // ako je x veći od vrednosti na indeksu i, pomaknite tačku razdvajanja udesno
	        fib3 = fib2;
	        fib2 = fib1;
	        fib1 = fib3 - fib2;
	        offset = i;
	      }
	 
	      else if (arr[i] > x) {  // ako je x manji od vrednosti na indeksu i, pomaknite tačku razdvajanja ulevo
	        fib3 = fib1;
	        fib2 = fib2 - fib1;
	        fib1 = fib3 - fib2;
	      }
	 
	      else {
	        return i; // ako je x jednako vrednosti na indeksu i, vratite indeks
	      }
	    }
	 
	    if (fib2 == 1 && arr[offset+1] == x) {  // ako x nije nadjeno u nizu, vratite -1
	      return offset + 1;
	    } else {
	      return -1;
	    }
	  }

		public static void main(String[] args) {

			int[] arr = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235 };
			int n = arr.length;
			int x = 235;
			int ind = fibonacciSearch(arr, x);
			if (ind >= 0) {
				System.out.println("Found at index: " + ind);
			} else {
				System.out.println(x + " isn't present in the array");
			}

		}

	}
