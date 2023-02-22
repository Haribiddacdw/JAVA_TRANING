package Q9;

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(){
        super("Negative values not allowed");
    }
}
class OutRangeException extends Exception {
    public OutRangeException(){
        super("Values out of range (0-100) not allowed");
    }
}
public class CalculateAverage {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int totalMark = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter student" + i + " marks :");
            try {
                int marks = Integer.parseInt(sc.nextLine());
                if(marks<0){
                    throw new NegativeValueException();
                }else if (marks>100){
                    throw new OutRangeException();
                }
                totalMark = totalMark + marks;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, Please enter once again");
                i--;
            }catch(NegativeValueException e){
                System.out.println(e+" Please enter once again");
                i--;
            }catch(OutRangeException e){
                System.out.println(e+" Please enter once again");
                i--;
            }
        }
        double average = (double) totalMark / 10;
        System.out.println("The average mark of ten students = " + average);
    }
}
