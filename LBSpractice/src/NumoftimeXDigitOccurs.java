
public class NumoftimeXDigitOccurs {
	public static void main(String[] args) {

		int num = 2422;
		int count = 0;
		int target = 2;

		while (num != 0) {
			int rem = num % 10;
			if (rem == target) {
				count++;
			}
			num /= 10;
		}
		System.out.println(count);
	}
}
