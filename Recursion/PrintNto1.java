package recursion;

public class PrintNto1 {
	
	public static void Nto1(int n) {
		if(n==0) {
			return ;
		}else {
			System.out.println(n+"");
			Nto1(n-1);
		}
			
	}

	public static void main(String[] args) {
		
	Nto1(10);

	}

}
