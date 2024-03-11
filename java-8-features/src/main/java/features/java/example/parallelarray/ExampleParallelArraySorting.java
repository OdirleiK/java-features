package features.java.example.parallelarray;

import java.util.Arrays;

public class ExampleParallelArraySorting {

	public static void main (String[] args) {
		
		int[] array = {5, 8, 1, 0, 6, 9, 50, -3};
		
		for(int i : array) {
			System.out.println(i + " ");
		}
		System.out.println("=========");

		Arrays.parallelSort(array);
		
		for(int i : array) {
			System.out.println(i + " ");
		}
	}

}
