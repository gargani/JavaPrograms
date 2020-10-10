package arrayPrograms;

public class FindMinElementInArray {
    public static int FindMinValueinArray() {
        int[] Array = { 20, 40, 50, 60, 30, 15, 6, 89 };

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
}
