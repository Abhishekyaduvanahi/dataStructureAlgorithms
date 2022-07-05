package recursion;

public class isPal {
	public static boolean Pal(String str,int start,int end) {
		
	if(start>=end) {
		return false;
	}
	return (str.charAt(start)==str.charAt(end)&&Pal(str,start+1,end-1));
	}
	public static void main(String[] args) {
	
		

		System.out.println(	Pal("aabaaa",0,5));
		

	}

}
