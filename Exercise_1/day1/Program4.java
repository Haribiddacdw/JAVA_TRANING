package day1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Number to Check Whether it is Prime or not");
			int number = 27;
			int flag = 0;
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println(number + " is a prime number");
			if (flag == 1)
				System.out.println(number + " is a not prime number");
		}
	}
}
