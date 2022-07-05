package recursion;
 
// start saying means it will start from 1

public class Print1toN {
	
	public static void starttoN(int n) {
		if(n==0) {
			return ;
		}
		starttoN(n-1);
		System.out.println(n+"");
		
	}

	public static void main(String[] args) {
		int n =7;
	starttoN(8);
	}

}
