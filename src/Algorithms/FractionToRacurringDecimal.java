package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

/* Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
If the fractional part is repeating, enclose the repeating part in parentheses.

For example,
Given numerator = 1, denominator = 2, return "0.5".
Given numerator = 2, denominator = 1, return "2".
Given numerator = 2, denominator = 3, return "0.(6)".
*/
public class FractionToRacurringDecimal {

	public static String solution(int num, int den) {
		StringBuilder sb = new StringBuilder();
		int q = num / den;
		int r = num % den;
		sb.append(q);
		if (r == 0) {
			sb.append(q);
		} else {
			sb.append(".");
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			
			while (r != 0) {
				// If reminder started to repeat, key = reminder, value = position of reminder
				// in q
				if (hashMap.containsKey(r)) {
					int postionOfSameReminder = hashMap.get(r);
					sb.insert(postionOfSameReminder, "(");					
					sb.append(")");
					break;
				} else {
					hashMap.put(r, sb.length());
					r = r * 10;
					q = r / den;
					r = r % den;
					sb.append(q);					
				}
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number :");
		int num = scanner.nextInt();
		System.out.print("Please enter denominator :");
		int den = scanner.nextInt();

		String result = solution(num, den);
		System.out.println("Result = " + result);

	}

}
