/*
 * Write a method to replace all spaces in a string with Ô%20Õ
 */

public class _1_5 {
	static String testString = "I am fine";
	static String result = "I%20am%20fine";
	
	public static void main(String[] args) {
		System.out.println(replaceWith(testString,"%20"));
	}

	public static String replaceWith(String s, String r){ // passing reference ?
		int numOfSpace = 0;
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == ' ') numOfSpace++;
		}
		StringBuffer newStr = new StringBuffer(s.length()+numOfSpace * (r.length()-1));
		for (int j = 0; j < s.length(); j++){
			if (s.charAt(j) == ' ') 
				newStr.append(r);
			else 
				newStr.append(s.charAt(j));
		}
		// s = newStr.toString(); // not gonner work
		return newStr.toString();	
	}
}
