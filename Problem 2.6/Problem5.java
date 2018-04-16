import java.util.LinkedList;
public class Problem5 {
		
	public static boolean palindrome(LinkedList ls){
		
		int i =0; 
		int j = ls.size()-1;
		while(i!=j){
			if(ls.get(i)!=ls.get(j)){
				return false;
			}
			j--;
			i++;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(8);
		ls.add(5);
		ls.add(7);
		ls.add(5);
		ls.add(8);
		
		System.out.println(palindrome(ls));
	}
}
