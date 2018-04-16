import java.util.LinkedList;
public class Problem2 {	
	static int Min = Integer.MAX_VALUE;
	static int index = -1;
	static LinkedList<Integer> ls = new LinkedList<Integer>();
	
public static void push(int n){
	Min = (Min < n)? Min : n;
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

public static int min(){

	return Min;
}
	
public static void main(String arg[]){
	push(1);
	push(2);
	push(3);
	push(4);
	push(5);
	
	System.out.println(min());
	for(int i=0; i<5;i++){
		System.out.println(pop());
	}
}
}
