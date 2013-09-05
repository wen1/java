import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {
	Graph g;
	Graph.Node[] nodes;
	@Before
	public void setUp(){
		/*
		 * create a graph
		 */
		Vector<Graph.Node> inputNodes = new Vector<Graph.Node>();
	 nodes = new Graph.Node[8];
		for(int i = 0; i<8; i++){
			nodes[i] = new Graph.Node(i);
		}
		nodes[0].adjacents.add(nodes[1]);
		nodes[0].adjacents.add(nodes[2]);
		nodes[0].adjacents.add(nodes[5]);
		nodes[1].adjacents.add(nodes[3]);
		nodes[2].adjacents.add(nodes[5]);
		nodes[4].adjacents.add(nodes[0]);
		nodes[7].adjacents.add(nodes[6]);
		nodes[6].adjacents.add(nodes[2]);
		
		for(int i = 0; i<8; i++){
			inputNodes.add(nodes[i]);
		}
		
		g = new Graph(inputNodes);
		/*
		 * end of create a graph
		 */
	}
	
	@Test
	public void testGetNodes() {
		System.out.println(g.getNodes());
		for (Graph.Node n : g.getNodes()){
			System.out.println(n + " " + n.adjacents);
		}
		System.out.println("");
	}

	@Test
	public void testInsertNode() {
		Graph.Node node8 = new Graph.Node(8);
		node8.addNode(nodes[5]);
		node8.addNode(nodes[6]);
		g.insertNode(node8);
		
		for (Graph.Node n : g.getNodes()){
			System.out.println(n + " " + n.adjacents);
		}

	}

}
