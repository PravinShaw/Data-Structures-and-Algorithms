package bit;


//AND return 1 if both bits are 1
//OR  return 1 if either of bits are 1
//XOR return 1 if bits are different return 0 if bits are same
public class SimpleBitwiseOperator {
	
	public int AND(int x, int y) {
		return x&y;
	}
	
	public int OR(int x, int y) {
		return x|y;
	}
	public int XOR(int x,int y) {
		return x^y;
	}

	public static void main(String[] args) {
		SimpleBitwiseOperator sbo = new SimpleBitwiseOperator();
		System.out.println(sbo.AND(3, 6));
		System.out.println(sbo.OR(3, 6));
		System.out.println(sbo.XOR(3, 6));
		
		
	}
}
