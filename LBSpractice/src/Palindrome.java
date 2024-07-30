
public class Palindrome {
	public static void main(String[] args) {
		int num = 12;
		int res = 0;
		int n = num;

		while (num != 0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num /= 10;
		}
		System.out.println(res);
		if (n == res) {
			System.out.println("Is Palindrome num");
		} else {
			System.out.println("Not a palindrome num");
		}
	}
}
