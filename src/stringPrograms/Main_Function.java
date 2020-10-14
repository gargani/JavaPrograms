package stringPrograms;

public class Main_Function {

	static int a;
	static int b;

	public static void main(String[] args) {
		//CheckAnagram();
		 //PrintASCIIValue();
		Add(2);
		Add("Ani");
		int value = Add(9, 8);
		System.out.println("This is function 3 : " + value);
	}

	public static void Add(int a){
		System.out.println("This is function 1 : " + a);
	}

	public static void Add(String abc){
		System.out.println("This is function 2 : " + abc);
	}

	public static int Add(int a, int b){
		int sum = a + b;
		return sum;
	}
}
