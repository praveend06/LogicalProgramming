package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3));

		// 1. LinkedHashSet
		LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<Integer>(numbers);

		ArrayList<Integer> numbersListWithoutduplicate = new ArrayList<>(uniqueNumbers);

		System.out.println(numbersListWithoutduplicate);

		// 2. Stream

		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
