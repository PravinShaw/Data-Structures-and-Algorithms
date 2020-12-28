package mathematics;

public class PrimeFactors {

	
	void factors(int n) {
		
		for (int i = 2; i*i <=n; i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			
		}
		if(n>1) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		PrimeFactors pf= new PrimeFactors();
		pf.factors(315);
	}
}
