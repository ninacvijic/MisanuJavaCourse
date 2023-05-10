package cvija;

public class GraphImplementation {

	public static void main(String[] args) {
	
		Graph<Integer> graph = new Graph<Integer>();  // kreiranje objekta klase Graph
		graph.addNewEdge(0, 1, true); // dodavanje grana grafu
		graph.addNewEdge(0, 4, true);
		graph.addNewEdge(1, 2, true);
		graph.addNewEdge(1, 3, false);
		graph.addNewEdge(1, 4, true);
		graph.addNewEdge(2, 3, true);
		graph.addNewEdge(2, 4, true);
		graph.addNewEdge(3, 0, true);
		graph.addNewEdge(2, 0, true);
	
		System.out.println("Adjacency List for the graph:\n" + graph.toString());  // ispisuje listu susedstva koja predstavlja graf
		graph.countVertices();  // broji broj cvorova u grafu
		graph.countEdges(true);  // broji broj grana u grafu
		graph.containsEdge(3, 4);  // proverava da li postoji grana ili ne između dva navedena cvora
		graph.containsEdge(2, 4);
		graph.containsVertex(3);  // proverava da li je cvor prisutan ili ne
		graph.containsVertex(5);


	}

}
