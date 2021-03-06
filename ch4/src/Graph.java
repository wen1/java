import java.util.Stack;
import java.util.Vector;

public class Graph {
	public static class Node{// remember to put static for Node
		int data;
		boolean visited;
		Vector<Node> adjacents;
		
		public Node(int _data){
			data = _data;
			visited = false;
			adjacents = new Vector<Node>();
		}
		
		public Node(Vector<Node> _nodes, int _data) {
			data = _data;
			adjacents = _nodes;
		}
		
		public void addNode(Node _node){
			adjacents.add(_node);
		}
		
		public String toString(){
			return data+"";
		}
	}
	
	Vector<Node> nodes;

	Graph(){
		nodes = new Vector<Node>();
	}
	
	Graph(Vector<Node> _nodes) {
		nodes =  _nodes;
	}
	
	public Vector<Node> getNodes(){
		return nodes;
	}
	
	public void insertNode(Node _node){
		nodes.add(_node);
	}
	
	// 4.2
	public boolean isConnected(Node start, Node end){
		Stack<Node> stack = new Stack<Node>();
		stack.push(start);
		while ( !stack.isEmpty()){
			Node n = stack.pop();
			if (n == end) return true;
			for (Node adj : n.adjacents){
				if (!adj.visited){
					stack.push(adj);
					
				}
			}
		}
		return false;
	}
	
	public boolean isVisited(Node node){
		
	}


	
	
}
