/**
 * 	Verdict	: Accepted
 * 	OJ	 	: UVA online judge
 * 
 * 	@author: absakDev 
 * 	@version: 25/5/2016
 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();
		String URL[] = new String[11];
		int v[] = new int[11];
		int maxValue;
		for (int I = 1; I <= T; I++) {
			maxValue = Integer.MIN_VALUE;
			for (int J = 1; J <= 10; J++) {
				URL[J] = input.next();
				v[J] = input.nextInt();
				if(v[J] >= maxValue) {
					maxValue = v[J];
				}
			}
			System.out.format("Case #%d:\n", I);
			for (int J = 1; J <= 10; J++) {
				if(v[J] == maxValue) {
					System.out.println(URL[J]);
				}
			}
		}
		input.close();
	}

}
