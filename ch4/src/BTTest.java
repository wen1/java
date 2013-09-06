import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BTTest {
	BT btree;  // each node has no parent pointer
	BT bst;
	BT biTree;  // each node has parent pointer
	@Before
	public void setUp()  {
		/*
		 * create a Binary Tree like below:
		 * 				0
		 * 		1				2
		 * 	3		4		5		6
		 */
		BT.Node[] nodes = new BT.Node[7]; 
		for (int i = 0; i < 7; i++){
			nodes[i] = new BT.Node(i);
		}
		btree = new BT(nodes[0]);

		for (int i = 0; i < 3; i++){
			btree.addToLeft(nodes[i], nodes[i*2+1]);
			btree.addToRight(nodes[i], nodes[i*2+2]);
		}

		/*
		 * creat a binary search tree like below:
		 * 				4
		 * 		1				6
		 * 	0		3		5		9
		 * 
		 */
		BT.Node[] bstNodes = new BT.Node[7];
		int[] datas = {4,1,6,0,3,5,9};
		for (int i = 0; i < 7; i++){
			bstNodes[i] = new BT.Node(datas[i]);
		}
		bst = new BT(bstNodes[0]);
		for (int i = 0; i < 3; i++){
			bst.addToLeft(bstNodes[i], bstNodes[i*2+1]);
			bst.addToRight(bstNodes[i], bstNodes[i*2+2]);
		}

		/*
		 * create a btree where each node have a parent pointer
		 * btree is as below
		 * 				0
		 * 		1				2
		 * 	3		4		5		6
		 */
		BT.Node[] nodesArr = new BT.Node[7]; 
		for (int i = 0; i < 7; i++){
			nodesArr[i] = new BT.Node(i);
		}
		biTree = new BT(nodesArr[0]);

		for (int i=0; i<3; i++){
			biTree.addToLeft(nodesArr[i], nodesArr[i*2+1]);
			biTree.addToRight(nodesArr[i], nodesArr[i*2+2]);
		}
		for (int i=1; i< 7; i++){
			int parentIndex = (i%2 == 0 ? i/2-1 : i/2);
			nodesArr[i].parent = nodesArr[parentIndex];
		}

	}

	@After
	public void clean(){
		btree = null;
		bst = null;
	}

	@Test
	public void testSetUp() {
		assertEquals("3140526",btree.inOrder());
		assertEquals("0134256",btree.preOrder());
	}


	@Test
	public void testIsBST() {
		assertEquals(false, btree.isBST());
		assertEquals(true, bst.isBST());
	}

	@Test
	public void testFirstCommonAncestor() {
		// test parent assignment;
		for (BT.Node n : biTree.getNodes()){
			System.out.println(n + " " + n.parent);
		}
	}

	@Test
	public void testIsSubtree() {

	}

	@Test
	public void testFindPaths() {

	}

}
