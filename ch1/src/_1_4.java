/*
 * Write a method to decide if two strings are anagrams or not
 * 
 */
public class _1_4 {
	static String strA = "abade";
	static String strB = "badae";

	public static void main(String[] args) {
		System.out.println(isAnagrams(strA, strB));
	}

	public static boolean isAnagrams(String a, String b) {
		if (a.length() != b.length())
			return false;

		int[] check = new int[256];
		for (int i = 0; i < 256; i++) {
			check[i] = 0;
		}

		for (int j = 0; j < a.length(); j++) {
			check[a.charAt(j)]++;
		}
		for (int k = 0; k < b.length(); k++) {
			if (check[b.charAt(k)] == 0) {
				return false;
			} else {
				check[b.charAt(k)]--;
			}
		}

		return true;
	}
}
