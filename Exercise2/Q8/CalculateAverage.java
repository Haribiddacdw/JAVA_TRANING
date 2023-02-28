package Q8;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int totalMark = 0;
            for (int student = 1; student <= 10; student++) {
                System.out.println("Enter student" + student + " marks :");
                try {
                    int marks = Integer.parseInt(sc.nextLine());
                    totalMark = totalMark + marks;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, Please enter once again");
                    student--;
                }
            }
            double average = (double) totalMark / 10;
            System.out.println("The average mark of ten students = " + average);
        }
    }
}
