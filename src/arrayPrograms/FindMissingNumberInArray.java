package arrayPrograms;

public class FindMissingNumberInArray {

    public static void main(String args[]){
        ReturnMissingNumber();
    }
    //Assumptions:
    //no duplicates
    //no need to be sorted
    //values should be in range

    public static void ReturnMissingNumber() {
        try {
            int givenArray[] = {1, 2, 4, 5, 6};

            int sumOfGivenArray = 0, sumOfRange = 0, missingNumber = 0;

            for (int value : givenArray) {
                sumOfGivenArray = sumOfGivenArray + value;
            }
            System.out.println("Sum of given array is : " + sumOfGivenArray);

            for (int i = 6; i > 0; i--) {
                sumOfRange = sumOfRange + i;
            }
            System.out.println("Sum of given range is : " + sumOfRange);

            //Logic
            missingNumber = sumOfRange - sumOfGivenArray;
            System.out.println("Missing number from the range is : " + missingNumber);
        }
        catch (ArrayIndexOutOfBoundsException indexError) {
            System.out.println("Exception is thrown : " + indexError);
        }
    }
}
