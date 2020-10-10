package arrayPrograms;

public class FindMaxElementInArray {

    public static int FindMaxValueinArray() {

        int[] Array = { 20, 40, 50, 60, 30, 15, 6, 8 };

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
}
