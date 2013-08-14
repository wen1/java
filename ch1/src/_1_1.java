

public class _1_1 {
	/* content to be test */
	public static String testString = "abcedaj";
	
	public static void main(String[] args) {
		System.out.println(testString +"  "+ isUnique2(testString));
	}

	public static boolean isUnique(String s) {
		// create a boolean array to record the char when the show up
		boolean[] isShowUp = new boolean[256];
		for (int i = 0; i < isShowUp.length; i++) {
			isShowUp[i] = false;
		}
		// for loop through the string
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			if (isShowUp[ch])
				return false;
			isShowUp[ch] = true;
		}
		return true;
	}

	public static boolean isUnique2(String s) {
		int checker = 0;
		for (int i = 0; i<s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if ((checker & (1<<val)) > 0)
				return false;
			checker |= (1<<val);
		}
		return true;
	}
}
