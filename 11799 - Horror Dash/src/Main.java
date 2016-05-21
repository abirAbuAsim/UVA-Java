import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase, numberOfCreatures, minDistance, distance;
		
		testCase = input.nextInt();
		for (int I = 1; I <= testCase; I++) {
			numberOfCreatures = input.nextInt();
			minDistance = -1;
			for (int J = 1; J <= numberOfCreatures; J++) {
				distance = input.nextInt();
				if (distance > minDistance) {
					minDistance = distance;
				}
			}
			System.out.println("Case " + I +": " + minDistance);
		}
	}

}
