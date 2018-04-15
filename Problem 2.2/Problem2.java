import java.util.LinkedList;
public class Problem2 {
	
	public static int kth(LinkedList ls, int k){
		int h= ls.size()-k;
		//ls.get(h);               we can use something like this but is not normal.
		int i;
		for(i=0; i< h;i++); //normally can use ls = ls.next
		
		return (int) ls.get(i);
		
	}
	
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(8);
		
		 int h=kth(list, 5);
		 System.out.println(h);
		 
	}
}
