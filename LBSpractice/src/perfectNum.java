public class perfectNum {
	public static void main(String[] args) {
		int num = 28;
		int sum = 0;
		
		for (int i = 1; i <= num / 2; i++) {
			if(num%i==0) {
			sum += i;
			System.out.print(i+" ");
		}
	}
		System.out.println();
		if(sum==num) {
			System.out.println("Is a Perfect Number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
		}
	
}