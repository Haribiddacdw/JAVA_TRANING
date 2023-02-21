package day1;

import java.util.Scanner;

public class Program10 {
	
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter no of rows :");
       int row = scan.nextInt();
       System.out.println("Enter no of rows :");
       int column = scan.nextInt();
       int[][] array = new int[row][column];
	   System.out.println("Enter Two Dimensional Matrix Values: ");
	   
		  for(int i=0;i<array.length;i++)
		  {
			  for(int j=0;j<array.length;j++)
			  {
					array[i][j]=scan.nextInt(); 
			  }
		  }
		  print(array);
	  }
	
	public static void print(int array[][]){

		  for(int i=0;i<array.length;i++)
		  {
			  for(int j=0;j<array.length;j++)
			  {
					  System.out.print(array[i][j]+" "); 
			  }
			  System.out.println();
		  }
	  }
}
