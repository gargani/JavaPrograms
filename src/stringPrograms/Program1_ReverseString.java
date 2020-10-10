package stringPrograms;

public class Program1_ReverseString {

	static String input_String = "Anirudh";
	static String rev_String = "";
	static int str_length = input_String.length();

	public static void main(String[] args) throws InterruptedException {

		System.out.println(recursiveString(input_String));

		ReverseStringOne();
		ReverseStringTwo();
		ReverseStringThree();
		SampleProgramOnString();

	}

	public static String recursiveString(String input_String) {

		if (input_String == null || input_String.length() <= 1)
			return input_String;
		else
			return recursiveString(input_String.substring(1)) + input_String.charAt(0);

	}

	// Method 1 : String Concatenation
	public static void ReverseStringOne() {

		for (int i = str_length - 1; i >= 0; i--) {

			rev_String = rev_String + input_String.charAt(i);
		}

		System.out.println("Reverse of given string is: " + rev_String);

	}

	// Method 2: Character Array
	public static void ReverseStringTwo() {

		char arr[] = input_String.toCharArray();

		for (int i = str_length - 1; i >= 0; i--) {

			rev_String = rev_String + arr[i];
		}

		System.out.println("Reverse of given string is: " + rev_String);
	}

	// Method 3: Using reverse method on StringBuffer/StringBuilder class
	public static void ReverseStringThree() {

		// Tread safe, mutable sequence of characters
		StringBuffer sb = new StringBuffer(input_String);

		// No guarantee of Synchronization, faster than StringBuffer
		// append and insert are the most used methods

		StringBuilder sb_obj = new StringBuilder(input_String);

		System.out.println(sb.reverse());

		System.out.println(sb_obj.reverse());
	}

	// Sample code given in interview and asked about the output
	public static void SampleProgramOnString() {

		String s1 = new String("abc");
		String s2 = new String("def");
		String s3 = ("abc");

		System.out.println(s1 == "abc");
		System.out.println(s1 == s2);
		System.out.println("abc" == s3);

	}

}
