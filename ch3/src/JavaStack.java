import java.util.Stack;

public class JavaStack {
	public void main(String[] args){
		Stack<Integer> st = new Stack<Integer>();
		st.push(new Integer(1));
		st.push(new Integer(2));
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
