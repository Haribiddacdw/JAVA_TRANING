package Q8;

import java.util.Scanner;

public class CalculateAverage {
      
	public static void main(String[] args)throws Exception {

            Scanner sc = new Scanner(System.in);
            int totalMark=0;
			for (int i = 1; i <=10; i++) {
				System.out.println("Enter student" + i + " marks :");
				try{
                    int marks = Integer.parseInt(sc.nextLine());
                    totalMark = totalMark+marks;
                }catch(NumberFormatException e){
                    System.out.println("Invalid input, Please enter once again");
                    i--;
                }
			}
            double average = (double) totalMark/10;
            System.out.println("The average mark of ten students = "+average);
	}
}
