import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n; //	Number of Requirements
		int p; //	Number of Proposals
		String reqNames[] = new String[1001]; // Name of the requirements
		String proposalName = ""; // Name of the proposal
		double d; // price of the proposal
		int r; // Number of met requirements
		int maxRequirement = Integer.MIN_VALUE;
		String metReqNames[] = new String[1001]; 
		double minPrice = Double.MAX_VALUE;
		String selectedProposalName = "";
		int caseNum = 0;
		
		while (input.hasNextInt()) {
			caseNum++;
			n = input.nextInt();
			p = input.nextInt();
			input.nextLine();
			
			if(n == 0 && p == 0) {
				break;
			} 
			//String extra = input.next();
			for (int I = 1; I <= n; I++) {
				reqNames[I] = input.nextLine();
				System.out.println(reqNames[I]);
			}
			for (int J = 1; J <= p; J++) {
				proposalName = input.next();
				d = input.nextDouble();
				r = input.nextInt();
				//extra = input.next();
				input.nextLine();
				
				if (r > maxRequirement) {
					maxRequirement = r;
					minPrice = d;
					selectedProposalName = proposalName;
				}
				for (int K = 1; K <= r; K++) {
					metReqNames[K] = input.nextLine();
				}
			}
			System.out.println("RFP #" + caseNum);
			System.out.println(selectedProposalName);
		}
		
	}

}
