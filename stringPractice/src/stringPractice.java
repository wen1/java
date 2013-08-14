import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class stringPractice {
	public static void main(String[] args) {
		/* change a string to char then using Array.sort to sort the char[] */
		String a = "dalfjqopewjgdkanv";
		char[] b = a.toCharArray();
		Arrays.sort(b);
		System.out.println(b);
		
		/* basic method of hashmap */
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			map.put(i, "student"+i);
		}
		/* to get each entry of the hash map*/
		for (Entry<Integer,String>pair : map.entrySet()) {
			System.out.println(pair.getKey());
		}
		System.out.println(map.toString());
		System.out.println(map);
		
		/* stringBuffer */
		StringBuffer sb = new StringBuffer("hello");
		sb.setCharAt(1, 'a');
		System.out.println(sb);
		
		sb.insert(1, "ijk");
		System.out.println(sb);
	}
}
