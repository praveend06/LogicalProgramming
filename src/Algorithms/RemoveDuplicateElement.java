package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,1,2,3,4,5,1,2,3));
		
		LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbersListWithoutduplicate = new ArrayList<>(uniqueNumbers);
		
		System.out.println(numbersListWithoutduplicate);

	}

}
