public class _5_1 {
	static int n = 1024; //10000000000
	static int m = 21;   //    10101
	static int i = 2;
	static int j = 6;
	
	public static void main(String[] args){
		fun(n,m,i,j);
	}
	
	public static int fun(int n, int m, int i, int j) {

		int left = ~((1<<j+1)-1);
		int right = ((1<<i)-1) ;
		int mask = left | right;
		n &= mask;
		
		m <<= i;
		n |= m;
		
		System.out.println(Integer.toBinaryString(n));
		
		return n;
	}
	
	/* decimal to binary
	 * need to deal with the boundary 
	 */
	public static int toBinary(int num) {
		int result = 0;
		int base = 10;
		int acc = 1;
		while (num!=0){
			result += num%base *acc ;
			num /=base;
			acc *= 2;
		}
		return result;
	}
	
	/* binary to decimal
	 * need to deal with the boudnary 
	 */
	public static int toDecimal(int num){
		int result = 0;
		int base = 2;
		int acc = 1;
		while(num!=0){
			result += num%2 *acc;
			num /= base;
			acc *=10;
		}
		return result;
	}
}
