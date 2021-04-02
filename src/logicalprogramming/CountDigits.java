package logicalprogramming;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter number :");
		int givenNumber = scanner.nextInt();
		int digits = 0;
		while (givenNumber != 0) {
			givenNumber = givenNumber / 10;
			digits++;
		}
		System.out.println("number of digits:" + digits);
	}

}
