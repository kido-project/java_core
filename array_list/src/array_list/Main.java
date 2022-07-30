package array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	private static StudentList studentList = new StudentList();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array have hard length, array list have flexible length.
		
		// ARRAY
		int[] intArray = new int[10];

		int[] intArray2 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
//		calculateAverage();
		
		// ARRAY LIST
		ArrayList<Integer> listIntegers = new ArrayList<Integer>();
		listIntegers.add(11);
		listIntegers.add(567);
		listIntegers.add(23);
		listIntegers.add(44);
		printArrayList(listIntegers);

	}

	public static void calculateAverage() {
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so de: ");
		for (int i = 0; i < 5; i++) {
			int number = scanner.nextInt();
			total += number;
		}
		System.out.println("TBC: " + (float) total / 5);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + ",");
		}

	}
	
	public static void printArrayList(ArrayList<Integer> listIntegers) {
//		for (int i = 0; i < listIntegers.size(); i++) {
//			System.out.print(listIntegers.get(i) + ", ");
//		}
		listIntegers.sort(Comparator.naturalOrder());
		for (Integer integer : listIntegers) {
			System.out.print(integer + ", ");
		}
	}
}
