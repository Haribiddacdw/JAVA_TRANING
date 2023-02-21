package day1;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			int sum = 0;
			float average = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			average = (float) sum / n;
			System.out.println("Average of n numbers is " + average);
		}
	}
}
