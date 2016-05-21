import java.util.Scanner;

public class DivisionOfNlogonia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * the first line of a test case contains one integer K
		 * indicating the number of queries that will be mad (0 < K < 10 ^ 3)
		 */
		int K; 
		
		/*
		 * the second line of a test case contains two integers 
		 * N and M representing the coordinates of the division point. 
		 */
		int N, M;
		
		/*
		 * Following K lines each contains two integers
		 * X and Y representing the coordiantes of a residence
		 */
		int X, Y;
		
		// Input begins here
		K = input.nextInt();
		for (int I = 1; I <= K; I++) {
			
			//getting the division points
			N = input.nextInt();
			M = input.nextInt();
			
			//getting the coordinates of the residence
			X = input.nextInt();
			Y = input.nextInt();
			
			// check where the residence end position is
			if (X > M && Y > N) {
				System.out.println("NE");
	
			} else if (X > M && Y < N) {
				System.out.println("SE");
				
			} else if (X < M && Y > N ) {
				System.out.println("NO");
				
			} else if (X < M && Y < N) {
				System.out.println("SO");
			} else if (X == M || Y == N) {
				System.out.println("divisa");
			}
		}

	}

}
