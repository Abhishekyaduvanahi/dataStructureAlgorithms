package recursion;

public class RecursionOutputPractise1 {
	public static int fun(int n) {
		if(n==1) {
			return 0;
		}
		else {
		return n+fun(n/2);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(fun(100));
		

	}

}
