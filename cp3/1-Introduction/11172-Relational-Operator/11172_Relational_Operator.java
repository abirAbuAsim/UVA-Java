import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//the test case
		int testCase = input.nextInt();
		int firstNum, secondNum;
		for(int I = 0; I < testCase; I++){
			firstNum = input.nextInt();
			secondNum = input.nextInt();

			if(firstNum > secondNum){
				System.out.println(">");
			}else if(firstNum < secondNum){
				System.out.println("<");
			}else{
				System.out.println("=");
			}
		}
	}
}
