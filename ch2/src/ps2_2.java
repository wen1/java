/*2.2
Implement an algorithm to find the kth to last element of a singly linked list.
*/
/*
GIVEN: a LinkList lst & int k
WHERE: k>0 and k<=lst.length
RETURN: the kth to last element of a singly linked list
EXAMPLES:
lst:[1]->[2]->[3]->[4]->[5]->[6]
findKthToLast(lst, 2) => 5
*/


public class ps2_2 {
	public static Object findKthToLast(LinkList lst, int k){
		LinkList.Node front = lst.head;
		LinkList.Node end =lst.head;
		int offset = k-1;
		while(offset!=0){
			if (end == null) return null; // k is not valid
			end = end.next;
			offset--;
		}
		
		while(end != lst.tail){
			end = end.next;
			front = front.next;
		}
		
		return front.data;
	}
}
