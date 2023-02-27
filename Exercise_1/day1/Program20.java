package day1;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int row = scan.nextInt();
		System.out.println("Enter number of column ");
		int column = scan.nextInt();
		System.out.println("Two Dimensional Matrix :");
		int[][] array = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		System.out.println("Two Dimensional Matrix :");
		largestnumberinRow(array, row, column);

	}

	public static void largestnumberinRow(int[][] array, int row, int column) {
		int i = 0;
		int max = 0;
		while (i < row) {

			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			System.out.println("The Largest Element in row " + (i + 1) + " is " + max);
			max = 0;
			i++;

		}

	}
}
