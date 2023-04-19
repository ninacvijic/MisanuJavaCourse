package cvija;

import java.util.Stack; // moramo importovati stek

public class TestOblik {

	// I nacin:
	/*public static void main(String[] args) {

		Krug k = new Krug(1);  // unosim proizvoljno dimenzije
		System.out.println("Površina kruga je " + k.uzmiPovrsinu());
		
		Pravougaonik p = new Pravougaonik(4, 5);
		System.out.println("Površina pravougaonika je " + p.uzmiPovrsinu());

	}

}*/
	
	// II nacin - preko steka:
	
	public static void main(String[] args) {
		Krug k = new Krug(1);
		Pravougaonik p = new Pravougaonik(4, 5);
		
		Stack stek = new Stack();  // objekat
		stek.push(k);  // push = postavi   //*novo*
		stek.push(p);
		
		while(!stek.empty()) {  // dok stek nije prazan radi sledece
			Oblik o = (Oblik) stek.pop();  // pop = uzmi     // *novo*
			System.out.println("Povrsina je " + o.uzmiPovrsinu());
		}
		
	}
}
	
	
