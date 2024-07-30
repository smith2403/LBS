
public class LCM {
	public static void main(String[] args) {
		int n1 = 24;
		int n2 = 16;
		int lcm = n1 > n2 ? n1 : n2;

		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				break;
			}
			lcm++;
		}
		System.out.println(lcm);
	}
}
