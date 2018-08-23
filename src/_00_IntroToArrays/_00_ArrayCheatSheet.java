package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strArr = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(strArr[2]);
		// 3. set the third element to a different value
		strArr[2] = "f";
		// 4. print the third element again
		System.out.println(strArr[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = "z";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		// 7. make an array of 50 integers
		int[] intArr = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < intArr.length; i++) {
			Random r = new Random();
			int random = r.nextInt(100);
			intArr[i] = random;
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int min = 100;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] < min) {
				min = intArr[i];
			}
		}
		System.out.println("Smallest value: " + min);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");

		}
		System.out.println(" ");
		// 11. print the largest number in the array.
		int max = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] > max) {
				max = intArr[i];
			}
		}
		System.out.println("Largest value: " + max);
		// 12. print only the last element in the array
		System.out.println(intArr[49]);
	}
}
