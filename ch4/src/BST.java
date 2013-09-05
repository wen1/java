
public class BST {
	public static class Node{
		public int data;
		public Node left,right;
		public Node(int _data){
			data = _data;
		}
	}
	
	public Node root;
	BST(){
		root = null;
	}
	/*
	 * Insert
	 */
	public void insert(int _data){
		root = insert(root,_data);
	}
	private Node insert(Node root, int _data){
		if (root == null){
			return new Node(_data);
		}else if (_data < root.data){
			root.left = insert(root.left,_data);
		}else if (_data > root.data){
			root.right = insert(root.right, _data);
		}
		return root;
	}
	
	/*
	 * Traversal
	 */
	public String inOrder(){
		return inOrder(root);
	}
	private String inOrder(Node root){
		if (root == null) {
			return "";
		}else {
			return inOrder(root.left) + root.data + inOrder(root.right);
		}
	}
	
	public String preOrder(){
		return preOrder(root);
	}
	private String preOrder(Node root){
		if (root == null){
			return "";
		} else {
			return root.data + preOrder(root.left) + preOrder(root.right); 
		}
	}
	
	public String postOrder(){
		return postOrder(root);
	}
	private String postOrder(Node root){
		if(root == null){
			return "";
		} else {
			return postOrder(root.left) + postOrder(root.right) + root.data;
		}
	}
	
	/*
	 * delete
	 */
	public void delete(int _data){
		root = delete(root, _data);
	}
	private Node delete(Node root, int _data){
		if (root == null) {
			System.out.println(_data + " not found");
		} else if (_data < root.data) {
			root.left = delete(root.left, _data);
		} else if (_data > root.data) {
			root.right = delete(root.right, _data);
		} else {// find the _data
			if(root.left == null) {
				return root.right;
			}else if (root.right == null) {
				return root.left;
			}else {
				Node pre = root;
				Node cur = root.left;
				while (cur.right != null) {
					pre = cur;
					cur = cur.right;
				}
				root.data = cur.data;
				if (pre.left == cur) {
					pre.left = cur.left;
				} else {
					pre.right = cur.left;
				}
			}
		}
		return root;
	}
	
	//4.5

	public boolean isBST(){
		return false;
	}

	// 4.7

	public Node FirstCommonAncestor(Node n1, Node n2){
		return new Node(1);
	}

	// 4.8

	public boolean isSubtree(BT otherBT){
		return false;
	}

	//4.9  print all paths

	public void findPaths(int Value){
		
	}
}
