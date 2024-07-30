
public class perfectSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 26;
		boolean square = false;
		for (int i = 1; i * i <= num; i++) {
			if (i * i == num) {
				System.out.println(i);
				square = true;
				break;
			}
		}
		System.out.println("Perfect Square: " + square);
	}

}
