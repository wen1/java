
public class _5_5 {
	static int num1 = 31;
	static int num2 = 14;
	
	public static void main(String[] args){
		System.out.println(getNumOfBitToConvert(num1,num2));
	}
	
	public static int getNumOfBitToConvert(int a, int b){
		int count = 0;
		while(a!=0 || b!=0){
			int da = a%2;
			int db = b%2;
			if (da != db){
				count++;
			}
			a >>= 1;
			b >>= 1;
		}
		return count;
	}
	// from CTCI
	public static int bitSwapedRequired(int a, int b){
		int count = 0;
		for (int c = a^b; c!=0; c>>=1){
			count += c & 1;
		}
		return count;
	}
	
}
