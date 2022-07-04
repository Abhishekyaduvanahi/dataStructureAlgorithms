package bitwise;

public class checkKthBitIsSet {
	public static void kthbit(int n,int k)
	{
		if(((n&1<<(k-1))!=0)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("N0");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 kthbit(5,3);

	}

}
