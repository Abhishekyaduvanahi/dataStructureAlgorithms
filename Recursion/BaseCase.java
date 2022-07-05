package recursion;
// Basic function of base case is to avoid running infinite time ........
// when you are reducing a problem into smaller problem then there come a 
// case when you can not reduce further that case is known as base case 

public class BaseCase {
	
	public static void fun1(int n) {
		if (n==0) {
			return;
		}
		System.out.println("I love coding ");
		fun1(n-1);
	}

	public static void main(String[] args) {
		fun1(10);
		

	}

}
