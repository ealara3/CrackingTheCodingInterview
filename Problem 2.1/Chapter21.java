import java.util.Arrays;
import java.util.LinkedList;
public class Chapter21 {

	public static LinkedList remove(LinkedList ls){
		LinkedList hold=ls;
		int hold2;
		int num = 0;
		for(int i=0;i<hold.size();i++){
			hold2 = (int) hold.get(i);
			for(int j=i+1; j<hold.size();j++){
				if(hold2 == ((int)hold.get(j))){
					hold.remove(j);
				}
			}
		}
		return hold;
	}
	
	public static void main(String[] args){
		int[] arr={1,5,8,1,7,1};
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(8);
		
		LinkedList ls =remove(list);
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
		}
	}
}
