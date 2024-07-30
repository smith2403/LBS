
public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int fnum = 0;
		int snum = 1;
		int nxtnum;

		System.out.print(fnum + " " + snum + " ");

		for (int i = 3; i <= num; i++) {
			nxtnum = fnum + snum;
			fnum = snum;
			snum = nxtnum;
			System.out.print(nxtnum + " ");
		}
	}
}
