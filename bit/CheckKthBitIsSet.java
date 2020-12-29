package bit;

public class CheckKthBitIsSet {
	
	//Program to check if the kth bit is set or not
	// eg n=5  000000...0101 and k = 3
	//return tru because 3rd bit is set to 1
	// Idea is to left shift 1 by (k-1) bit and do and operator. If the result is not 0 then it is set
	
	
	public boolean CheckBit(int n, int k) {
		
		if((n & (1<<(k-1))) !=0 ) {
			return true;
			
		}
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		CheckKthBitIsSet cb = new CheckKthBitIsSet();
		
		System.out.println(cb.CheckBit(5, 4));
	}

}
