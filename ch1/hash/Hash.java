import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
public class Hash {
	public static void main(String[] args){
		Map<String,Integer> students = new HashMap<String,Integer>();
		
		students.put("alan", 3);
		students.put("bob", 1);
		students.put("cathe", 2);
		
		for (Entry<String,Integer> e : students.entrySet()){
			System.out.println(e);
		}
		
	}
	
}
