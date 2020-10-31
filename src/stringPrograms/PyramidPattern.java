package stringPrograms;

import static stringPrograms.Anagram.CheckAnagram;

public class PyramidPattern {
    //Pyramid Pattern
    public static void main(String args[]){

        try {
            String[] name1 = {"Bob", "Sam", "Ani"};
            String[] name2 = {"Bob", "Ram", "Ani"};

            Integer[] num1 = {1, 2, 3, 5};
            Integer[] num2 = {5, 4, 3, 2};

            //Random.commonNames2(name1, name2);
            //Random.commonNumbers1(num1, num2);

            //Rectangle(8, 20);
            //Triangle(5);
            SimpleTriangle(5);
            CheckAnagram();
        }
        catch(Exception ex){
            System.out.println("Catch block");
            System.exit(0); //Exits JVM and no line is executed after this.
        }
        finally {
            System.out.println("Final block");
        }
    }

    public static void SimpleTriangle(int rows){
            for(int i = 1; i <= rows; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
    }

    public static void Triangle(int rows){
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void Rectangle(int rows, int columns){

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if(i ==1|| j==1|| i == rows ||j == columns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
