package recursion;

public class InfiniteRecursion {
	
	public static void fun() {
		System.out.println("I Love Coding ");
		fun();
	}

	public static void main(String[] args) {
		
		fun();

	}

}
