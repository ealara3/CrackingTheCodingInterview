import java.util.LinkedList;

public class Problem3 {
	static int index = -1;
	static LinkedList<Integer> ls = new LinkedList<Integer>();
	
public static void push(int n){
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
}
	
public static void main(String arg[]){
	push(5);
	push(19);
	push(500);
	push(42);
	push(18);
	
	System.out.println(popAt(3));
}
}
