package cvija;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<T>  {  // genericka klasa
	
	/*
	 * Graf je struktura podataka koja pohranjuje povezane podatke. Drugim rečima, graf G je definisan kao skup cvorova (V) i 
	 * grana (E) koje povezuju cvorove.
	 * Svaki cvor(vertices) i grana(edge) imaju relaciju. Gde cvor predstavlja podatke, a grana predstavlja odnos između njih. 
	 * Vertex(cvor) je označen krugom sa oznakom na njemu. Grane su označene linijom koja povezuje čvorove.
	 * Konačan skup uređenog para oblika (u, v) se naziva grana. Par oblika (u, v) označava da postoji grana od cvora u do cvora v.
	 * Težina(Weight): Označena je na grani.
	 * Put(Path): Put je način da se dođe do odredišta od početne tačke u nizu.
	 * Primeri grafova su mreža društvenih medija, računarska mreža, Google Maps, itd.
	 * 
	 * Prikazi grafova:
	 * Matrica susedstva (Adjacency Matrix)
	 * Lista susedstva (Adjacency List)
	 * 
	 *  Postoje razni tipovi grafova:
	 *  Weighted Graph-U njemu, svaka grana sadrži neke podatke (weight) kao što su udaljenost, težina, visina, itd. Označava se kao w(e).
	 *  Koristi se za izračunavanje troškova prelaska od jednog cvora do drugog.
	 *  Unweighted Graph-Graf u kojem grane nisu povezane ni sa jednom vrednošću.
	 *  Directed Graph(Usmereni)-graf u kojem grane predstavljaju smer. Koriste se strelice umesto linija (grana). 
	 *  Smer označava put kojim se dolazi od jednog čvora do drugog čvora. Moze se kretati u jednom ili u oba smera.
	 *  Undirected Graph-Graf u kojem su grane dvosmerne naziva se neusmerenim grafom. U neusmerenom grafu može se kretati u bilo kom smeru.
	 *  Može se koristiti isti put za povratak kroz koji se prošlo. Dok se u usmerenom grafu ne može vratiti sa iste putanje.
	 *  Connected Graph-Za graf se kaže da je povezan ako postoji bar jedan put između svakog para cvorova. 
	 */
	
	private Map<T, List<T>> map = new HashMap<>();  // kreiranje objekta klase Map koji pohranjuje grane grafa

	public void addNewVertex(T s) {   // metoda koja dodaje novi cvor grafu
		map.put(s, new LinkedList<T>());
	}

	public void addNewEdge(T source, T destination, boolean bidirectional) {  // metoda koja dodaje granu između izvora i odredišta      
		if (!map.containsKey(source))
			addNewVertex(source);
		if (!map.containsKey(destination))
			addNewVertex(destination);
		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}

	public void countVertices() {  // metoda koja broji broj cvorova
		System.out.println("Total number of vertices: " + map.keySet().size());
	}

	public void countEdges(boolean bidirection) {  // metoda koja broji broj grana
		int count = 0;  // varijabla za pohranjivanje broja grana
		for (T v : map.keySet()) {
			count = count + map.get(v).size();
		}
		if (bidirection == true) {
			count = count / 2;
		}
		System.out.println("Total number of edges: " + count);
	}

	public void containsVertex(T s) {  // proverava da li graf ima cvor ili ne
		if (map.containsKey(s)) {
			System.out.println("The graph contains " + s + " as a vertex.");
		} else {
			System.out.println("The graph does not contain " + s + " as a vertex.");
		}
	}

	public void containsEdge(T s, T d) {  // proverava da li graf ima granu ili ne, gde su s i d dva parametra koja predstavljaju izvor (cvor) i
		if (map.get(s).contains(d)) {     // odredište (cvor)          
			System.out.println("The graph has an edge between " + s + " and " + d + ".");
		} else {
			System.out.println("There is no edge between " + s + " and " + d + ".");
		}
	}
	
	public String toString() {  // ispisuje listu susednosti svakog cvora
		StringBuilder builder = new StringBuilder();
		for (T v : map.keySet()) {  // foreach petlja koja se ponavlja preko ključeva
			builder.append(v.toString() + ": ");
			for (T w : map.get(v)) {  // foreach petlja za dobijanje cvorova
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}
		return (builder.toString());
	}

}

		
