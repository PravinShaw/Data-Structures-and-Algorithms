package mathematics;

public class CountDigitsNumberUsingRecursion {
	
	public static int returnDigit(int n) {
		
		if(n<=0) {
			return 0;
		}
		else
			return 1 + returnDigit(n/10);
	}
	
	public static void main(String[] args) {
		
		int num=123;
		
		
		System.out.println(returnDigit(num));
		
	}

}
