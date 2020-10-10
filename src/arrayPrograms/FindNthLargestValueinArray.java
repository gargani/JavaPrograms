package arrayPrograms;

public class FindNthLargestValueinArray {
    // Nth largest number in an array
    public static int FindFifthLargestValueinArray() {
        int[] Array = { 10, 20, 30, 40, 50, 60, 70, 80 };

        int length = Array.length;

        System.out.println("This is length of given Array " + length);

        int temp = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Array[i] > Array[j]) {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.println("5th largest number in the array is : " + Array[5]);
        return Array[5];
    }

}
