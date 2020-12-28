package mathematics;

public class GCDandLCM {
	
	
	public int GCD(int a, int b) {
		int res =Math.min(a, b);
		while(true) {
			if(a%res==0 && b%res==0) {
				return res;
			}
			res--;
		}
		
	}
	
	public int LCM(int a , int b) {
		
		int res=Math.max(a, b);
		
		while(true) {
			if(res%a ==0 && res%b ==0) {
				return res;
			}
			res++;
		}
	}
	
	public static void main(String[] args) {
		GCDandLCM gl= new GCDandLCM();
		System.out.println(gl.GCD(6, 9));
		System.out.println(gl.LCM(3, 5));
	}

}
