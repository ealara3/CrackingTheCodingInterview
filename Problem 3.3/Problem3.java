import java.util.Stack;

public class Problem3 {
	//static int index = -1;
	//static LinkedList<Integer> ls = new LinkedList<Integer>();
	
/*public static void push(int n){
	ls.add(n);
	index++;
}
public static int pop(){
	int remove;
	remove = ls.get(index);
	ls.remove(index);
	index--;
	return remove;
}
public static int popAt(int n){
	int remove = ls.get(n);
	ls.remove(n);
	return remove;
}*/
	static Stack<Integer> st= new Stack<Integer>();
	static Stack<Integer> st2 = new Stack<Integer>();
	static Stack<Integer> st3 = new Stack<Integer>();
	static Stack<Integer> st4 = new Stack<Integer>();
	
	public static int popAt(int n){
		int i=0;
		switch(n){
		case 1:
			i = (int) st.pop();
			break;
		case 2:
			i = (int) st2.pop();
			break;
		case 3:
			i = (int) st3.pop();
			break;
		case 4:
			i = (int) st4.pop();
			break;
		}
	return i;	
	}
	
public static void main(String arg[]){
	st.push(5);
	st.push(19);
	st.push(500);
	st.push(42);
	st.push(18);
	st2.push(15);
	st2.push(25);
	st2.push(85);
	st2.push(15);
	st3.push(79);
	st3.push(98);
	st3.push(75);
	st3.push(54);
	st4.push(2);
	st4.push(198);
	st4.push(354);
	st4.push(189);
	
	System.out.println(popAt(4));
}
}
