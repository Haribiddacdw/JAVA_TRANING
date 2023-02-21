package day1;

import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to converts into words");
		int number = scan.nextInt();
		String temp = Integer.toString(number);
		int[] numberArray = new int[temp.length()];

		for (int i = 0; i < temp.length(); i++) {
			numberArray[i] = Character.getNumericValue(temp.charAt(i));
			convertToWords(Character.getNumericValue(temp.charAt(i)));
		}

	}

	public static void convertToWords(int numericValue) {
		switch (numericValue) {
		case 1:
			System.out.print("one ");
			break;
		case 2:
			System.out.print("two ");
			break;
		case 3:
			System.out.print("three ");
			break;
		case 4:
			System.out.print("four ");
			break;
		case 5:
			System.out.print("five ");
			break;
		case 6:
			System.out.print("six ");
			break;
		case 7:
			System.out.print("seven ");
			break;
		case 8:
			System.out.print("eight ");
			break;
		case 9:
			System.out.print("nine ");
			break;
		case 0:
			System.out.print("zero ");
			break;
		}

	}
}
