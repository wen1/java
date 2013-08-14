
public class _5_6 {
	static int num = 26;
	
	public static void main(String[] arg)
	{
		System.out.println(Integer.toBinaryString(num));
		int swaped = swapOddEvenBits(num);
		System.out.println(Integer.toBinaryString(swaped));
		System.out.println(Integer.toBinaryString(swapOddEvenBitsCrazy(num)));
	}
	
	public static int swapOddEvenBits(int n)
	{
		int acc = 1;
		int result = 0; 
		while (n != 0) {
			int temp = n%4;
			if (temp == 1) {
				result += acc * 2;
			} else if (temp == 2) {
				result += acc * 1;
			}
			acc *= 4;
			n /= 4;
		}
		return result;
	}
	
	public static int swapOddEvenBitsCrazy(int n){
		return ((0xaaaaaaaa & n) >> 1 | ((0x55555555 & n) << 1));
	}
}
