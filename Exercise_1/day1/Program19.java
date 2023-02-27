package day1;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
       
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of rows ");
		int row = scan.nextInt();
		System.out.println("Enter number of column ");
		int column = scan.nextInt();
		System.out.println("Enter Two Dimensional Matrix values :");
		int[][] array = new int[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		System.out.println("Two Dimensional Matrix :");
		reverseArray(array, row, column);

	}

	public static void reverseArray(int[][] array, int row, int column) {
		for (int i = 0; i < row; i++) {
			int rowstart = 0;
			int rowend = column - 1;
			while (rowstart < rowend) {
				int temp = array[i][rowstart];
				array[i][rowstart] = array[i][rowend];
				array[i][rowend] = temp;
				rowstart++;
				rowend--;
			}
		}
		print(array);
	}

	public static void print(int array[][]) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
	}
}
