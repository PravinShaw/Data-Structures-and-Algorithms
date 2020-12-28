package mathematics;

import java.util.Iterator;

//Program to find trailing 0 in the result of a factorial
//5! = 120, 1 trailing 0 : 
public class CountTrailingZeroesInFactorial {
	int num=1;
	public int FindTrail(int n) {
		for (int i = 1; i <=n; i++) {
			 num = num*i;
			
		}
		
		int res=0;
		for (int i = 5; i <= n; i=i*5) {
			
			res=res + n/i;
		}
		return res;
	}
	public static void main(String[] args) {
		
		CountTrailingZeroesInFactorial ct = new CountTrailingZeroesInFactorial();
		System.out.println(ct.FindTrail(19));
	}
	

}
