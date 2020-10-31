package stringPrograms;

public class SwapNumbers {
        public static void main(String[] args){

        swapWithoutVariable(50,70);
        swapWithVariable(70,80);

        }
        public static void swapWithoutVariable(int a, int b){

            a = a-b;
            b = a+b;
            a = b-a;

            System.out.println("a: "+a);
            System.out.println("b: "+b);
        }
        public static void swapWithVariable(int a, int b) {

            int temp;

            temp = a;
            a = b;
            b = temp;

            System.out.println("a: "+ a);
            System.out.println("b: "+ b);
        }
    }
