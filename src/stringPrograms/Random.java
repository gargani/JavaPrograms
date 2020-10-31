package stringPrograms;

import java.util.*;

public class Random {

	public static void main (String[]args) throws Exception {
/*
		HackrRankQ();
		Rectangle(10,30);
		Triangle(8);
		bar();
		
		String[] names1 = new String[]{"Ava", "Emma", "Olivia", "Ani", "James"};
		String[] names2 = new String[]{"Olivia", "Sophia", "Bob", "Ani"};

		Integer[] arr1 = new Integer[]{2,3,4,8,6,5,0,9,7};
		Integer[] arr2 = new Integer[]{5,1,3,7,2,6,5,8,9};
		Integer[] arr3 = new Integer[]{10,11,13,17,19};

		uniqueNamesUsingHashSet(names1, names2);
		UniqueNameUsingList(names1, names2);
		uniqueNumberFromArray(arr1, arr2);
		uniqueNumberFromArray(arr1, arr2,arr3);

		findCommonNamesUsingSet(names1, names2); //should print Emma and Olivia
		findCommonNumbersUsingSet(arr1, arr2);

		ForLoopTest();
		RunTimeException();

		SwitchStatement();
		StringStatement();
		ListExample();
*/
		//ExceptionExample();
		Method1();
	}
	private static void Method1(){
		Method2();
		System.out.println("3. This is Method 1");
	}

	private static void Method2(){
		try{
		String str = null;
		str.toString();
		} catch(Exception ex){
			System.out.println("1. Execption is handled in Method 2.");
		}
		finally{
			System.out.println("2. This is finally block..");
		}
	}
	private static void ExceptionExample(){
		try {
			int a = 0;
			//int b = 10 / a;
			//System.exit(0);
			boolean s = false;

			if(s=true){
				System.out.println("True will be printed ############");
			}
			else
				System.out.println("False will be printed#############");


		} catch (ArithmeticException aex) {
			System.out.println("This is catch block");
		}
		finally{
			System.out.println("This is finally block");
		}
	}
	private static void ListExample(){

		List<String> listA = new ArrayList<>();
		listA.add("A");
		List<String> listB = listA;
		List<String> listC = new ArrayList<>(listB);

		listA.clear();
		listB.add("B");
		listC.add("C");

		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);

	}
	private static void StringStatement(){
		System.out.println("Test String statement");

		String s1 = "My name is Anirudh";
		String s2 = new String(s1);

		System.out.println((s1==s2)+ " " + s1.equals(s2)); //Output should be false true
	}
	private static void SwitchStatement() {
		System.out.println("Test switch statement");

		Integer varB = 10;

		switch(varB) {
			case 1: System.out.print("1");
			case 2: System.out.print("1"); break;
			case 10: System.out.print("1");
			case 5: System.out.print("1");
			default: System.out.print("10");

		}
	}

	private static void RunTimeException() {
		try{
			ThrowerMethod();
			System.out.println("I"); // will not be executed
		}
		catch(RuntimeException re){
			System.out.println("J");
		}
		catch(Exception e1){
			System.out.println("K");
		}finally{
			System.out.println("L");
		}
		System.out.println("M");
	}

	private static void ForLoopTest() {
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j >= 0; j--) {
				if(i==j)
					continue;
					System.out.println(i +" "+ j);
			}
		}
	}

	private static void ThrowerMethod(){
		throw new RuntimeException();
	}
	private static void HackrRankQ() {
		//access obj1 = new access();
		access obj2 = new access();

		//obj1.x = 0;
		//obj1.y = 0;
		obj2.x = 0;
		obj2.y = 0;

		//obj1.cal(1,2);
		obj2.cal(2,3);
		System.out.println(obj2.x+ ","+obj2.y);
	}

	public static void uniqueNamesUsingHashSet(String[] Names1, String[] Names2){

		Set<String> hs1 = new HashSet<>(Arrays.asList(Names1));
		Set<String> hs2 = new HashSet<>(Arrays.asList(Names2));

		boolean mergeSets = hs1.addAll(hs2);
		System.out.println("Output as Hashset is " +  hs1.toString());
		int size = hs1.size();
		System.out.println("Output as Hashset is " +  size);

	}

	public static void UniqueNameUsingList (String[] Names1, String[] Names2){

		List list = new ArrayList(Arrays.asList(Names1));
		boolean DoneList = list.addAll(Arrays.asList(Names2));

		Object[] resultArray = list.toArray();
		System.out.println("Result as List is ");
		Arrays.stream(resultArray).distinct().forEach(System.out::println);
	}

	public static void uniqueNumberFromArray(Integer[] Num1, Integer[] Num2){

		List listNumbers = new ArrayList(Arrays.asList(Num1));
		listNumbers.addAll(Arrays.asList(Num2));

		Object[] resultArray = listNumbers.toArray();
		System.out.println("Result as List is ");
		Arrays.stream(resultArray).sorted().distinct().forEach(System.out::println);
	}

	public static void uniqueNumberFromArray(Integer[] Num1, Integer[] Num2, Integer[] Num3){

		List listNumbers = new ArrayList(Arrays.asList(Num1));
		boolean DoneList = listNumbers.addAll(Arrays.asList(Num2));
		boolean SecondList = listNumbers.addAll(Arrays.asList((Num3)));

		Object[] resultArray = listNumbers.toArray();
		System.out.println("Result as List is ");
		Arrays.stream(resultArray).sorted().distinct().forEach(System.out::println);

		//Arrays.stream(resultArray).distinct().forEach(System.out::println);
	}

	//Set
	public static void findCommonNamesUsingSet(String[] Names1, String[] Names2) {

		Set<String> hs1 = new HashSet<>(Arrays.asList(Names1));
		Set<String> hs2 = new HashSet<>(Arrays.asList(Names2));

		for(var name : hs2){
			boolean b = hs1.add(name);
			if (b == false) {
				System.out.println(name);
			}
		}
	}

	public static void findCommonNumbersUsingForLoop(Integer[] Num1, Integer[] Num2) {
		HashSet<Integer> hashObject = new HashSet<>();
		for (var name:Num1) {
			for(var name2 : Num2){
				if(name==name2){
					boolean numbers = hashObject.add(name);
					if(numbers == true)
						System.out.print(name + " ");
				}
			}
		}
	}

	public static void findCommonNumbersUsingSet(Integer[] Num1, Integer[] Num2) {
		System.out.println("Result of commonNumbers2 method");
		Set<Integer> hs1 = new HashSet<>(Arrays.asList(Num1));
		Set<Integer> hs2 = new HashSet<>(Arrays.asList(Num2));

		for(int num : hs2){
			boolean b = hs1.add(num);
			if (b == false) {
				System.out.println(num);
			}
		}
	}

	//print Hollow rectangle

	public static void Rectangle(int rows, int columns) {
		int i, j;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= columns; j++) {
				if (i == 1 || i == rows || j == 1 || j == columns)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void HackertestQ1(){
		int i,j,k;
		for(i =0; i<3; i++){
			for(j =0; j<4; j++){
				for(k =0; k<5; k++){
					if(i==j && j==k){
						System.out.println("HackerTest result is " + i);
					}
				}
			}
		}
	}

	public static void HackerTestQ2(){
		String one = "I am Anirudh";
		String two = new String(one);
		System.out.println((one == two) + " " + one.equals(two));
		//Output = False true
	}

	public static int foo(int a , String s){
		s = "Yellow";
		a = a+2;
		return a;
	}

	public static void bar(){
		int a = 3;
		String s = "Blue";
		a = foo(a,s);
		System.out.println("a " + a + "s " + s);
	}

	public static void Triangle(int rows) {
		int i, j;
		// loop to iterate for the given number of rows
		for (i = 1; i <= rows; i++) {
			// loop to print the number of spaces before the star
			for (j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			// loop to print the number of stars in each row
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			// for new line after printing each row
			System.out.println();
		}
		

	}
}













