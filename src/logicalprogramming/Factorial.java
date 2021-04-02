package logicalprogramming;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter number :");
		int givenNumber = scanner.nextInt();
		// 4! = 4 × 3 × 2 × 1 = 24
		int result = 1;
		for (int i = 1; i <= givenNumber; i++) {
			result = result * i;
		}

		System.out.println("Result =" + result);
	}

}
