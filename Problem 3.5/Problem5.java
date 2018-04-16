import java.util.Stack;
public class Problem5 {
	
	public static void arrange(Stack st){
		Stack<Integer> stc = new Stack<Integer>();
		//int hold =(int) st.pop();
		while(!st.isEmpty()){
			int hold = (int) st.pop();
			while(!st.isEmpty() && (int)st.peek()>=hold){
				stc.push(((int)st.pop()));
			}
			stc.push(hold);
		}
		while(!stc.isEmpty()){
			st.push(stc.pop());
		}
	}
	
 public static void main(String arg[]){
	 Stack<Integer> st = new Stack<Integer>();
		 
	st.push(2);
	st.push(27);
	st.push(17);
	st.push(15);
	st.push(98);
	
	 arrange(st);
	System.out.println(st.isEmpty());
	while(!st.isEmpty()){
		System.out.println(st.pop());
	}
}
}
