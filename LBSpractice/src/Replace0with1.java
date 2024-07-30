
public class Replace0with1 {
	public static void main(String[] args) {
		int num = 9000;
		int result = 0;
		int reversedNum = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem == 0) {
				rem = 1;
			}
			reversedNum = (reversedNum * 10) + rem;
			num /= 10;
		}

		while (reversedNum != 0) {
			int rem = reversedNum % 10;
			result = (result * 10) + rem;
			reversedNum /= 10;
		}
		System.out.println(result);

	}
}
