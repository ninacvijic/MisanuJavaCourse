package cvija;

import java.util.Scanner;

/*
 Написати на језику Јава програм који читајући материјалне тачке с главног улаза направи низ материјалних тачака (читање се завршава 
 уносом негативне масе), испише на главном излазу добијени низ као и тачку која највише привлачи тачку 
 јединичне масе у координатном почетку и понавља претходне кораке све док не прочита празан низ (низ дужине 0).
 */

public class Main {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		    while (true) {
	            Niz niz = new Niz(5);
	            
	            while (true) {
	                System.out.print("m,x,y,z? ");
	                double m = input.nextDouble();
	                double x = input.nextDouble();
	                double y = input.nextDouble();
	                double z = input.nextDouble();
	                
	                if (m < 0) {
	                    break;
	                }
	                
	                niz.dodaj(new Tacka(m, x, y, z));
	            }
	            if (niz.vel() == 0) {
	                break;
	            }
	            System.out.println("Niz tacaka:");
	            niz.pisi();
	            
	            System.out.print("Najvise privlaci: ");
	            niz.maxF(new Tacka(1, 0, 0, 0)).pisi();
	            System.out.println();
		    }
              input.close();
	}

}


/* Npr.ovo ukucati u Consoli:
m,x,y,z? 5 3 4 5  // unosim ovo i ova 4 reda ispod
m,x,y,z? 1 1 1 1
m,x,y,z? 8 2 9 4
m,x,y,z? 2 4 6 2
m,x,y,z? -1 0 0 0
Niz tacaka:  // izbaci u Consoli
[5,(3,4,5)]
[1,(1,1,1)]
[8,(2,9,4)]
[2,(4,6,2)]
Najvise privlaci: [1,(1,1,1)]  // izbaci u Consoli
m,x,y,z? -1 0 0 0  // unosim
 */
  


    
 
    
  



       
    
