package package_JavaPrograms;

public class MaxValueinArray {

    public static int FindMaxValueinArray() {

        int[] Array = {20, 40, 50, 60, 30, 15, 6, 890};

        int length = Array.length;

        int max = Array[0];

        for (int i = 0; i < length; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
        }
        System.out.println("Largest number in the array is : " + max);
        return max;

    }

    public static int FindMinValueinArray() {
        int[] Array = {20, 40, 50, 60, 30, 15, 6, 89};

        int length = Array.length;

        int min = Array[0];

        for (int i = 0; i < length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        System.out.println("Smallest number in the array is : " + min);
        return min;
    }

    public static void DifferenceBetweenLargestSmallestArray() {
        int diff = FindMaxValueinArray() - FindMinValueinArray();
        System.out.println("Difference between Max and Min : " + diff);
    }

    //Kth largest number in an array
    public static int FindFifthLargestValueinArray() {
        int[] Array = {10, 20, 30, 40, 50, 60, 70, 80};

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

