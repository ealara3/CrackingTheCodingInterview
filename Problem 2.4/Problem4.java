import java.awt.List;
import java.util.LinkedList;

public class Problem4 {

	public static LinkedList arrange(LinkedList ls, int k){
		LinkedList<Integer> newls=new LinkedList<Integer>();
		
		
		for(int i=0; i<ls.size();i++){
			if(((int) ls.get(i))< k){
				newls.add(((int)ls.get(i)));
			}
		}
		for(int i=0; i<ls.size();i++){
			if(((int) ls.get(i))>= k){
				newls.add(((int)ls.get(i)));
			}
		}
		return newls;
	}
	
public static void main(String args[]){
	LinkedList<Integer> ls = new LinkedList<Integer>();
	
	ls.add(3);
	ls.add(5);
	ls.add(8);
	ls.add(5);
	ls.add(10);
	ls.add(2);
	ls.add(1);
	
	LinkedList List =arrange(ls, 5);
	
	for(int i=0; i<List.size(); i++){
		System.out.println(List.get(i));
	}
}
}
