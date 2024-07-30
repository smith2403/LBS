
public class DecimalToBinary {
	public static void main(String[] args) {

		int num = 1;
		int binary = 1;
		for (int i = 1; i <= num; i++) {
			int rem = num % 2;
			binary = (binary * 10) + rem;
			num /= 2;
		}
		System.out.println(binary);
	}
}
