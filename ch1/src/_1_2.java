
public class _1_2 {
	static String testString = "abcde";
	static char[] c_string = testString.toCharArray();
	public static void main(String[] args){
		reverseCString(c_string,testString.length());
		System.out.println(c_string);
	}
	
	public static void reverseCString(char[]s, int length){
		for (int i = 0; i<length/2; i++) {
			char temp = s[i];
			s[i] = s[length-1-i];
			s[length-1-i] = temp;
		}
	}
}
