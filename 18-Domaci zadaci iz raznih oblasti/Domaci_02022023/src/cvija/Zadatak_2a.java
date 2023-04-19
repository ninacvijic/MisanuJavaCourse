package cvija;

import java.util.ArrayList;

public class Zadatak_2a {

	// Npr.: 1232145657 -> 1234567

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(5);
		al.add(7);

		System.out.println("Lista: " + al);

		for (int i = 0; i < al.size() - 1; i++) {
			for (int j = i + 1; j < al.size(); j++) {

				if (al.get(i).equals(al.get(j)))
					al.remove(j);
			}
		}
		System.out.println("Lista bez duplikata: " + al);
	}

}
