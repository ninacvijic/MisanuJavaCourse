package cvija;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		
		List<String> LList = new LinkedList<String>();  // LList proizvoljan naziv
		
		LList.add("1");  // iako su brojevi ide pod "" jer je navedeno da je u pitanju stringovni tip !
		LList.add("2");
		LList.add("3");
		LList.add("4");
		LList.add("5");
		
		ListIterator itr = LList.listIterator();  // kreiranje ListIterator-a  // importovati ga!  // on  nam je alat da prodjemo dvosmerno kroz listu
		
		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa: ");  // listu mozemo proci dvosmjerno
		while(itr.hasNext())  // 0 .. n                                               // od prvog do zadnjeg i obrnuto
		{
			System.out.print(itr.next() + " ");  // bez ln da bi bili jedan pored drugog brojevi
		}                                        // i dodati " " kao razmak, da budu malo odvojeni brojevi a ne slepljeni
		
		System.out.println("\nKretanje kroz listu od poslednjeg do prvog elementa: ");
		while(itr.hasPrevious())  // n .. 0  // *novo: hasPrevious ! *
		{
			System.out.print(itr.previous() + " ");  // *novo: previous
		}
		

	}
}

