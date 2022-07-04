package bitwise;

public class CountSetBits1 {
	
	public static int count(int n) {
		int count =0;
		if(n==1) {
			return 1;
		}
		while(n<1) {
		
			if(n%2!=0) {
				count++;
				n=n/2;
			}
			
		}
	
		return count;
		
		
	}

	public static void main(String[] args) {
		
count(1);
	}

}
