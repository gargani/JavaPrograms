package arrayPrograms;

import static arrayPrograms.FindNthLargestValueinArray.FindFifthLargestValueinArray;

public class Main_Function {

	//Main Method
	public static void main(String[] args) {

		FindFifthLargestValueinArray();
		//ReturnMissingNumber();
		//FindMaxValueinArray();
		//FindMinValueinArray();
		//LargestNumber();
	}


	




	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}


}
