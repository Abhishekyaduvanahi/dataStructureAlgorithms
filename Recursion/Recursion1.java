package recursion;

public class Recursion1 {
	public static void fun1() {
		System.out.println("fun1");
		
	}
	public static void fun2() {
		System.out.println("Before fun 1");
		
		fun1();
		
		System.out.println("After fun 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before fun 2 ");
		fun2();
		System.out.println("After fun 2");
		

	}

}
