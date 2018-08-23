package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public void printStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void printStringBack(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public void printStringOther(String[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public void printStringRandom(String[] arr) {
		int[] rand = new int[arr.length];
		Random r = new Random();
		for (int i = 0; i < rand.length; i++) {
			int f = r.nextInt(arr.length);
			for (int j = 0; j < i; j++) {

			}
		}

	}

}
