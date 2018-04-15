import java.util.LinkedList;
public class Problem3 {
	
	public static LinkedList remove(LinkedList ls, char k){
		for(int i=0; i<ls.size();i++){
			if(k == ((char)ls.get(i))){
				ls.remove(i);
			}
			
		}
		
		
		return ls;
	}
	
	public static void main(String arg[]){
		LinkedList<Character> ls = new LinkedList<Character>();
		
		
		ls.add('a');
		ls.add('b');
		ls.add('c');
		ls.add('d');
		ls.add('e');
		ls.add('f');
		
		LinkedList list =remove(ls, 'c');
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
