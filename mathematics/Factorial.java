package mathematics;

public class Factorial {
	
	public int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		System.out.println(fac.fact(5));
		
	}

}
