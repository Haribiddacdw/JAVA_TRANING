package day1;

import java.util.Scanner;

public class Program5 {
	public static float calculateAverage(int number) {
		float average = 0;
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return average = (float) sum / number;
	}
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int number = scan.nextInt();
			System.out.println("Average of n numbers is " + calculateAverage(number));
		}
	}
}
