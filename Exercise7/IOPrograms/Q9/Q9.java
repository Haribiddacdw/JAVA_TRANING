package IOPrograms.Q9;

import java.util.Scanner;

/*@author Hari Prasath V
 *  @version 1.0
  */
public class Q9 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.nextLine();
        int count = 1;
        for (int i = 0; i < givenString.length() - 1; i++) {
            if ((givenString.charAt(i) == ' ') && (givenString.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words :"+count);

    }
}
