// not clear about the problem
public class _5_3 {
	static int number = 100;
	
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(number));
		int nextLargest = getNext(number,true);
		int nextSmallest = getNext(number,false);
		System.out.println(Integer.toBinaryString(nextLargest));
		System.out.println(nextLargest);
		System.out.println(Integer.toBinaryString(nextSmallest));
		System.out.println(nextSmallest);
	}
	
	public static int getNext(int n,boolean findLargest){
		int theNumOfOne = getNumOfOne(n);
		do{
			if (findLargest) n++;
			else n--;
		}while(getNumOfOne(n) != theNumOfOne);
		return n;
	}
	
	public static int getNumOfOne(int n) {
		int count = 0;
		while (n != 0) {
			int digit = n%2;
			if (digit == 1) count++;
			n /= 2;
		}
		return count ;
	}
}
