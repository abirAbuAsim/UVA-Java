import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase;
		
		testCase = input.nextInt();
		for (int I = 1; I <= testCase; I++) {
			ArrayList<Integer> employee = new ArrayList<Integer>();
			for (int J = 0; J < 3; J++) {
				employee.add(input.nextInt());
			}
			Collections.sort(employee);
			System.out.println("Case " + I +": " + employee.get(1));

		}
	}

}
