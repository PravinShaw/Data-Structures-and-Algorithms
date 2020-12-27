package mathematics;

public class PalindromeNumber {
	int secondNum=0;

	public  boolean palin(int num) {
		int compnum=num;
		while(num>0) {
			int digit = num%10;
		secondNum = secondNum*10 + digit;
		num=num/10;
		}
		return (secondNum==compnum);
		
	}
	
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.palin(18981));
	}
	
}
