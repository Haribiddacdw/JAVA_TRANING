package day1;
import java.util.Scanner;
public class Program13 {
	public static void main(String[] args) {

      try (Scanner scan = new Scanner(System.in)) {
		System.out.println ("Enter number no of Students ");
		 int student = scan.nextInt();
		 System.out.println ("Enter number no of Subjects ");
		 int no_sub = scan.nextInt();
		 int[][] marks = new int[student][no_sub+1];
		 for(int i=0;i<student;i++)
		 {
			 System.out.println ("Enter student "+(i)+" marks");
			 for(int j=0;j<=no_sub;j++)
			 {
				 marks[i][j]=scan.nextInt();
			 }
		 }
		 print(marks,student,no_sub);
		 
	}
     
	  }
	
	  public static void print(int array[][],int student,int no_sub)
	  {

		  for(int i=0;i<student;i++)
			  
		  {
			  int sum =0;
			  
			  for(int j=1;j<=no_sub;j++)
			  {
				  
					sum=sum+ array[i][j];
				  
			  }
			  System.out.println ("the mark of student "+(i+1)+" is "+sum);
			  System.out.println();
		  }
	  }
}
