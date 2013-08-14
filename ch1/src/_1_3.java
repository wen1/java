/*
 * Design an algorithm and write code to remove the duplicate characters 
 * in a string without using any additional buffer NOTE: One or two additional 
 * variables are fine An extra copy of the array is not
 * FOLLOW UP
 * Write the test cases for this method
 * 
 */
public class _1_3 {
	public static String testString = "aaabbb";

	public static void main(String[] args) {
		System.out.println(removeDuplicate(testString));
		
		char[] ch = new char[testString.length()];
		ch = testString.toCharArray();
		removeDuplicate2(ch);
		System.out.println(ch);
		
		
	}
	// method 1
	public static String removeDuplicate(String s) {
		char[] nStr = new char[s.length()];
		int i, j;
		int tail = 0;
		for (i = 0; i < s.length(); i++) {
			for (j = 0; j < tail; j++) {
				if (s.charAt(i) == nStr[j])
					break;
			}
			if (j == tail) {
				nStr[tail] = s.charAt(i);
				tail++;
			}
		}
		String result = new String(nStr);
		result.trim();
		return result;
	}
	
	// method 2
	public static void removeDuplicate(char[] s) {
		int tail = 0;
		int curr = 0;
		int i = 0;
		while (curr != s.length) {
			if (i == tail) {
				s[tail] = s[curr];
				i = 0;
				tail++;
				curr++;
			} else if (s[i] == s[curr]) {
				i = 0;
				curr++;
			} else {
				i++;
			}
		}
		// modify the rest of characters in s
		for (int j = tail; j <s.length; j++) {
			s[j] = 0;
		}
	}
	public static void removeDuplicate2(char[] s){
		int check = 0;
		int tail = 0;
		for (int i=0; i<s.length; i++){
			int val = s[i] - 'a';
			if((check & (1<<val)) == 0) {
				s[tail] = s[i];
				tail++;
				check |= (1<<val);
			}
		}
		for (int j = tail; j < s.length; j++){
			s[j] = 0;
		}
	}
}
