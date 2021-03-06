package chapters;

import java.util.Arrays;

public class Chapter4 {
	
	public static void part4point1() {
		String message = "hello world";
		System.out.println(message.substring(1,8));
		System.out.println(message.charAt(1));
		 
		String names = "Peter,Johan,Andy,David";
		String[] splitnames = names.split(",");
		System.out.println(Arrays.toString(splitnames) );
	 }
	
	
	public static void part4point2() {
		int[] userAge;
		userAge = new int[] {21,22,23,24,24};
		
		// Simplified statements
		int[] userAge2 = new int[] {21,22,23,24,25};
		// More simplified statement for Array
		int[] userAge21 = {21,22,23,24,25};
		
		// Specify specific size of array , but values default to 0
		int[] userAge3 = new int[5];
		
		System.out.println("userAge");
		System.out.println(Arrays.toString(userAge));
		System.out.println("userAge2");
		System.out.println(Arrays.toString(userAge2));
		System.out.println("userAge21");
		System.out.println(Arrays.toString(userAge21));
		System.out.println("userAge3");
		System.out.println(Arrays.toString(userAge3));
		
		//Update Array Value
		
		userAge[0] = 31;
		userAge[2] = userAge[2] + 20;
		System.out.println("userAge Array ");
		System.out.println(Arrays.toString(userAge));
		
	}
	
	public static void part4point2Coninues1() {
		
		//Compare arrays with each other
		int[] arr1 = {0,2,4,6,8,10};
		int[] arr2 = {0,2,4,6,8,10};
		int[] arr3 = {10,8,6,4,2,0};
		
		boolean result1 = Arrays.equals(arr1,arr2);
		boolean result2 = Arrays.equals(arr1,arr3);
		
		System.out.println(result1);
		System.out.println(result2);
		
		//Copy array from one to another 
		System.out.println("Copy some of souce array to dest array");
		int[] souce = {12,1,5,-2,16,14,18,20,25};
		System.out.println("souce Array: " + Arrays.toString(souce));
		int[] dest = Arrays.copyOfRange(souce, 3, 7);
		System.out.println("dest Array: " + Arrays.toString(dest));
		
		//Sort an array
		int [] numbers2 = {12,1,5,-2,16,14};
		Arrays.parallelSort(numbers2);
		System.out.println("Order by " + Arrays.toString(numbers2));
		
		//binarySearch
		int[] myInt = {21,23,34,45,56,78,99};
		int foundIndex = Arrays.binarySearch(myInt, 78);
		System.out.println(foundIndex);
		int foundIndex2 = Arrays.binarySearch(myInt, 39);
		System.out.println(foundIndex2);
		System.out.println("-4 means, - is value not found. 4 was calculated where value should have been(3) + 1");
		
		//Array lenght
		int[] userAge = {21,22,26,32,40};
		System.out.println("Array lenght:" + userAge.length);
		
		
		
	}
	
	public static void part4point3() {
		//Primitive Type store value
		int myNumber = 5;
		//Reference Type doesn't store value but reference to it memory,( store address of value)
		String message = "Hello";
		
		//Strings are immutable , cannot change ()
		//Java stores this as new value in memory ,and message is now referencing to it
		message = "World";
	}

	public static void main(String[] args) {
		//part4point1();
		//part4point2();
		//part4point2Coninues1();
		part4point3();
	}

}
