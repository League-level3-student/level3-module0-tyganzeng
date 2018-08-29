package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"hello", "my","name","is","Tygan"};
		MoreArrayFun a = new MoreArrayFun();
		a.printStrings(strings);
		a.printStringBack(strings);
		a.printStringOther(strings);
		a.printStringRandom(strings);
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
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int random = r.nextInt(arr.length - 1);
			String temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
