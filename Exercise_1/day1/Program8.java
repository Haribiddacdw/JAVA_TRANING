package day1;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Array Size :");
			int arraysize = scan.nextInt();
			int[] Array = new int[arraysize];
			System.out.println("Enter Array elements :");
			for (int i = 0; i < arraysize; i++) {
				Array[i] = scan.nextInt();
			}
			System.out.println("Enter the number you want that its location ");
			int key = scan.nextInt();
			int location = -1;
			for (int i = 1; i <= arraysize; i++) {
				if (key == Array[i])
					location = i;
			}
			System.out.println("Location of that number is " + location);
		}
	}
}
