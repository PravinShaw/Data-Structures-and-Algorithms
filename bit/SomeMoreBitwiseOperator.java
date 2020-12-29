package bit;

public class SomeMoreBitwiseOperator {
	//Remember in Java integer is represented in a 32 bit format
	
	//NOT inverts the bits : 0 becomes 1 and 1 becomes 0
	//Left Shift shifts the left bits and replaces 0 at the end
	//Right Shift operator shifts the right bits and accordingly replaces 0s or 1s at the end to maintain the sign
	//Unsigned Right Shift operator , 
	
	public int NOT(int x) {
		return ~x;
	}
	public int LeftShift(int x, int Bybits) {
		return x<<Bybits;
	}
	public int RightShift(int x, int Bybits) {
		return x>>Bybits;
	}
	public int UnsignedRightShift(int x, int Bybits) {
		return x>>>Bybits;
	}
public static void main(String[] args) {
	SomeMoreBitwiseOperator smbo= new SomeMoreBitwiseOperator();
	System.out.println(smbo.NOT(2));
	System.out.println(smbo.LeftShift(5,2));
	System.out.println(smbo.RightShift(5,2));
	System.out.println(smbo.UnsignedRightShift(5,2));
	
	
}
}
