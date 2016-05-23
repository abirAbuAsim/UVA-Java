/*
 * Verdict : Accepted
 * UVA online judge
 */
import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n; // number of rows
		int m; // number of columns
		int t = scan.nextInt(); // test cases
		for (int I = 1; I <= t; I++) {
			n = scan.nextInt();
			m = scan.nextInt();
			long result = (n / 3) * (m / 3);
			System.out.println(result);
		}
	}
}
