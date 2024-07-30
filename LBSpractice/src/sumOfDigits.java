
public class sumOfDigits {
public static void main(String[] args) {
	int num=1213;
	int sum=0;
	
	while(num!=0) {
		int rem = num % 10;
		sum+=rem;
		num/=10;
	}
	System.out.println("Sum of digits is "+ sum);
}
}
