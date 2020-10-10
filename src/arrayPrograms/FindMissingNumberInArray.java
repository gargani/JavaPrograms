package arrayPrograms;

public class FindMissingNumberInArray {

    //assumptions
    //no duplicates
    //no need to be sorted
    //values should be in range

    public static void ReturnMissingNumber() {
        try {
            int a[] = {1, 2, 4, 5, 6};
            int sumOfGivenArray = 0;
            int sumOfRange = 0;
            int missingNumber = 0;

            for (int value : a) {
                sumOfGivenArray = sumOfGivenArray + value;
            }

            System.out.println("Sum of given array is : " + sumOfGivenArray);

            for (int i = 6; i > 0; i--) {
                sumOfRange = sumOfRange + i;
            }
            //Logic
            missingNumber = sumOfRange - sumOfGivenArray;

            System.out.println("Sum of given range is : " + sumOfRange);
            System.out.println("Missing number from the range is : " + missingNumber);
        }
        catch (ArrayIndexOutOfBoundsException indexError) {

            System.out.println("Exception is thrown : " + indexError);

        }
        }

}
