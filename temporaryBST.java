//import java.util.Stack;


public class BST {
	/*
	 * field
	 */
	public Node root;
	
	/*
	 *  Node
	 */
	
	public class Node{
		Object data;
		Node left,right;
		
		Node (Object _data){
			data = _data;
			left = right = null;
		}
	}
	
	/*
	 * Insert
	 */
	// recursive
	public void insert(Object _data) {
		root = insert(root, _data);
	}
	private Node insert(Node _root, Object _data) {
		if (_root == null) 
			return new Node(_data);
		else if (_root.data.compareTo(_data) > 0) {
			return insert(_root->right, _data);
		} 
		else if (_root.data.compareTo(_data) < 0) {
			return insert(_root->left, _data);
		}
	}
	// non-recursive
	private void insert2(Object _data) {
//		Stack<Node> st = new Stack<Node>();
		if (root == null) {
			root = new Node(_data);
		} else {
			Node p = root;
			Node curr = p;
			while (curr!=null) {
				p = curr;
				if(_data < curr.data) {
					curr = curr.left;
				} else if (_data > p.data){
					curr = curr.right;
				} else {
					return;
				}
			}
			if (p.left == null) p.left = new Node(_data);
			else if (p.right == null) p.right = new Node(_data);
		}
	}
}
