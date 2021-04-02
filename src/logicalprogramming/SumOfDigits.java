package logicalprogramming;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		 
		 System.out.print("Please enter number :"); //121 = 4,(1,12),(2,1)(1,0)
		 int givenNumber = scanner.nextInt();
		 int orgNumber = givenNumber;
		 int sum = 0;
		 int reminder = 0;
		 
		 while(givenNumber > 0) {
			 reminder = givenNumber % 10;
			 sum = sum + reminder;
			 
			 givenNumber = givenNumber / 10;
		 }
		 
		 System.out.println("Result="+sum);
		 
	}

}
