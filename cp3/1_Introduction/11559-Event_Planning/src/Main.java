/**
 *  Verdict : Accepted 
 *  Judge: UVA online Judge
 */
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N; // Number participants
		long B; // the Budget
		long H; // Number of Hotels to consider
		long W; // Number of weeks to choose from
		long minCost; // Minimum cost to stay for the group
		long p; // Price for one person staying at the hotel
		long a[] = new long[14]; // Number of available beds
		boolean bedAvailable;
		
		while(input.hasNextLong()) {
			N = input.nextLong();
			B = input.nextLong();
			H = input.nextLong();
			W = input.nextLong();
			minCost = 10000000;
			bedAvailable = false;
			
			long tempCost;
			for (int I = 1; I <= H; I++) {
				p = input.nextLong();
				for (int J = 1; J <= W; J++) {
					a[J] = input.nextLong();
					if(a[J] >= N) {
						bedAvailable = true;
					}
				}
				if(bedAvailable) {
					tempCost = p * N;
					if (tempCost < minCost) {
						minCost = tempCost;
					}
				}
			}
			if (minCost <= B) {
				System.out.println(minCost);
			} else {
				System.out.println("stay home");
			}
		}
	}

}
