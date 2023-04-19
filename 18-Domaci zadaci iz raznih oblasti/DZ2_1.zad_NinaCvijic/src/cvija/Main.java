package cvija;

/*
 Саставити на језику Java главни програм који са главног улаза прочита низ зарубљених купа, проналази купу најмање запремине у низу, испише пронађену 
купу и њену запремину на главном излазу и понавља претходне кораке док за дужину низа не прочита недозвољену вредност. 
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  
          while (true) {
              System.out.print("n? ");
              int n = input.nextInt();

              if (n <= 0) 
            	  break;

              Niz niz = new Niz(n);
              for (int i = 0; i < n; i++) {
                  System.out.print("kupa[" + i + "]? ");
                  ZarubljenaKupa k = new ZarubljenaKupa();
                  ZarubljenaKupa.readFromInput();
                  niz.dodaj(k);
              }

              int imin = niz.getIndeksKupeMinV();
              System.out.println("min = " + niz.get(imin) + " (" + niz.get(imin).getV() + ")\n");
          }
          
          input.close();
      }
  }  
	
		








		      
		



    
    
    
  
    
 
   
  
    
   

  

          


