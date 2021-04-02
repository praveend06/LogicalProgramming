package logical_programming;

import java.util.Scanner;

public class Palindrome {

public static void main(String args[]) {	 
	 Scanner scanner  = new Scanner(System.in);
	 
	 System.out.print("Please enter number :");
	 int givenNumber = scanner.nextInt();
	 int copyNumber = givenNumber;
	 int currentDigit, reversedNumber = 0;
     do
     {
         currentDigit = copyNumber % 10; //takes the remainder
         reversedNumber = (reversedNumber * 10) + currentDigit; //creating the reversed number
         copyNumber= copyNumber / 10; //creating new number
     } while (copyNumber != 0);
     if (givenNumber == reversedNumber)
         System.out.println(" The number is a palindrome.");
     else
         System.out.println(" The number is NOT a palindrome.");
    
 }
}
