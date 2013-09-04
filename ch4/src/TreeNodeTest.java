import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TreeNodeTest {
	TreeNode root;
	@Before
	public void setUp(){
		/*
		 *        5
		 *      3    7
		 *    1  4  6  8
		 *  0  
		 */ 
		root = new TreeNode(5);
		TreeNode node1= new TreeNode(1);
		TreeNode node4= new TreeNode(4);
		TreeNode node3= new TreeNode(3);
		TreeNode node6= new TreeNode(6);
		TreeNode node7= new TreeNode(7);
		TreeNode node8= new TreeNode(8);
		TreeNode node0= new TreeNode(0);
		root.left =node3;
		root.right = node7;
		node3.left = node1;
		node3.right = node4;
		node7.left = node6;
		node7.right = node8;
		node1.left = node0;
	}
	@Test
	public void inOrderTest() {
		int expected[] = {0,1,3,4,5,6,7,8};
		TreeNode.inOrder(root);
	}

}
