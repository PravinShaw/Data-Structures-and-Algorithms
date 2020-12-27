package mathematics;


// This Program returns the digits in a number
// Eg : 123 : return 3 , 1234: return 4
public class CountDigitsNumber {
	
	public static void main(String[] args) {
		
		int num = 1234;
		
		int count= 0;
		
		while(num>0) {
			num=num/10;
			count++;
			
		}
		System.out.println(count);
	}

}
