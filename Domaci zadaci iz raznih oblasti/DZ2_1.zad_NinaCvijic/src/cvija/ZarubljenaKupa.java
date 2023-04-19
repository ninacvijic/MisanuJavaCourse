package cvija;

/*
 1. Пројектовати на језику Java следећи систем класа :
• Зарубљена купа се задаје помоћу полупречника доње (r1) и горње (r2) основице и висине (h) са подразумеваним вредностимаr1 = 2, r2 = 1, h =1. 
Могу да се дохвате димензије купе, да се израчуна запремина купе (V = π h (r12 + r22 + r1 r2) / 3), да се испита да ли је запремина једне купе мања од 
запремине друге купе (k1<k2), да се димензије купе прочитају из датотеке и да се купа уписује у датотеку у облику K(r1,r2,h).
 */

import java.util.Scanner;

public class ZarubljenaKupa {
	
	private double r1, r2, h;
	
	public ZarubljenaKupa() {
		r1 = 2;
		r2 = 1;
		h = 1;
	}

	public ZarubljenaKupa(double r1, double r2, double h) {
		this.r1 = r1;
		this.r2 = r2;
		this.h = h;
	}

	public double getR1() {
		return r1;
	}

	public double getR2() {
		return r2;
	}

	public double getH() {
		return h;
	}
	
	public double getV() { 
		return Math.PI*h*(r1*r1+r2*r2+r1*r2) / 3.0;
	}

	public static ZarubljenaKupa readFromInput() {
	    Scanner input = new Scanner(System.in);
	    System.out.print("r1? ");
	    double r1 = input.nextDouble();
	    System.out.print("r2? ");
	    double r2 = input.nextDouble();
	    System.out.print("h? ");
	    double h = input.nextDouble();
	    return new ZarubljenaKupa(r1, r2, h);
	  }
	
	 public boolean manjeOd(ZarubljenaKupa k2) { 
		 return getV() < k2.getV(); 
		 }

    public String toString() {
	   return "K(" + r1 + ", " + r2 + ", " + h + ")";
     }
	
}
	
	
	
	

