
public class Problem1 {
	static int i=0, j = 86, l=172;
	static int stack[] =new int[256];
	public static void push(int n){
		stack[i]=n;
		i++;
	}
	public static void push2(int n){
		stack[j]=n;
		j++;
	}
	public static void push3(int n){
		stack[l]=n;
		l++;
	}
public static void main(String args[]){
	push(1);
	push2(12);
	push3(14);
}
}
