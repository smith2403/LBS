
public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		boolean isPrime = true;

		if (num < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(isPrime);
	}

}
