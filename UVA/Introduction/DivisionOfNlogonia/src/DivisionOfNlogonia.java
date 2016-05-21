/**
 * UVA online judge problem id:   11498 - Division of Nlogonia
 * Status: Accepted
 * 
 * @author Abir Bin Ayub Khan A.K.A AbSak
 * @version 22 March, 2016
 */
import java.util.Scanner;

/*
 * Tips before submitting finally:
 * 
 * - change the class name to 'Main' 
 * - remove the 'public' access control modifier
 */
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
		 * X and Y representing the coordinates of a residence
		 */
		int X, Y;
		
		// Input begins here
		while (input.hasNextInt()) {
			K = input.nextInt();
			if(K == 0) {
				break;
			}
			M = input.nextInt();
			N = input.nextInt();
			for (int I = 1; I <= K; I++) {
				
				//getting the division points

				
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
				
				} // end of if-else  
			
			} // end of for loop
		
		} // end of while
	
	}
}
