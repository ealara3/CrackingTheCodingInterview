import java.util.Stack;

public class Problem4 {
	 static Stack<Integer> st = new Stack<Integer>();
	 static Stack<Integer> qu = new Stack<Integer>();
	 public static int remove(){
		 
		 
		 while(!st.isEmpty()){
			 qu.push(st.pop());
		 }
		int hold =(int) qu.pop();
		 while(!qu.isEmpty()){
			 st.push(qu.pop());
		 }
		 return hold;
	 }
	 public static void add(int n){
		 st.push(n);
	 }
	
public static void main(String arg[]){
	st.add(5);
	st.add(8);
	
	System.out.println("Queue:");
	while(!st.isEmpty()){
		System.out.println(remove());
	}
	st.add(5);
	st.add(8);
	System.out.println("Stack:");
	while(!st.isEmpty()){
		System.out.println(st.pop());
	}
}
}
