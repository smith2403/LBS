
public class Armstrong {

	public static void main(String[] args) {
		int num = 457;
		int result = 0;
		int n = num;

		while (num != 0) {
			int rem = num % 10;
			result = (rem * rem * rem) + result;
			num /= 10;
		}
		if (n == result) {
			System.out.println("Armstrong num");
		} else {
			System.out.println("Not Armstrong num");
		}

	}
}
