package arrayPrograms;

public class MaxMinElementsInArray {

	public static void main(String[] args) {

		// How To Find Maximum & Minimum Values in Array

		int arr[] = { 20, 2, 40, 60, 78, 90, 26 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++)
		{

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum number in array is : " + min);
		System.out.println("Maximum number in array is : " + max);
	}
}
