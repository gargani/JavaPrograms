package stringPrograms;

public class ReturnKeyword {

	public static void main(String[] args) {
		int[] callArray = retunArray(2, 3, 4);

		System.out.println(callArray[0]);
		System.out.println(callArray[1]);
		System.out.println(callArray[2]);

	}

	public static int[] retunArray(int a, int b, int c) {

		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;

		return array;

	}

}
