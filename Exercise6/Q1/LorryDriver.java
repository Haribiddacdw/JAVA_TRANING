package Q1;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

/*@author Hari Prasath V
 *  @version 1.0
  */

public class LorryDriver {
   //this method will return true if that day is second saturday
    private static boolean isSecondSaturdaty(LocalDate date) {

        if (date.getDayOfMonth() < 15 && date.getDayOfMonth() > 7 && date.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return true;
        }
        return false;
    }
  //this method will return true if that day is Holiday
    private static boolean isHoliday(LocalDate date) {
        if (date.getDayOfWeek() == DayOfWeek.SUNDAY ||
                date.equals(LocalDate.of(date.getYear(), Month.JANUARY, 1)) ||
                date.equals(LocalDate.of(date.getYear(), Month.AUGUST, 15)) ||
                date.equals(LocalDate.of(date.getYear(), Month.JANUARY, 26))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter speed of the lorry in km/h: ");
            int speed = input.nextInt();

            System.out.print("Enter distance to travel in km: ");
            int distance = input.nextInt();

            LocalDate startDate = LocalDate.parse("2023-03-07");
            LocalTime startTime = LocalTime.parse("09:30");
            String destination = "Ladakh";

            int totalDays = (distance / speed) / 8;
    
            LocalDateTime arrivalDateTime = LocalDateTime.of(startDate, startTime);

            LocalDate date = startDate;

            for (int i = totalDays; i > 0; i--) {
                //check that day is second saturday then add 2 days to it
                if (isSecondSaturdaty(date)) {
                    arrivalDateTime = arrivalDateTime.plusDays(2);
                     //check that day is holiday then add 1 day to it
                } else if (isHoliday(date)) {
                    arrivalDateTime = arrivalDateTime.plusDays(1);
                } else {
                    arrivalDateTime = arrivalDateTime.plusDays(1);
                    totalDays -= 1;
                }
            }

            // add 8 hours to the driving time
            arrivalDateTime = arrivalDateTime.plusHours(8);

            System.out.println("The lorry will " + destination + " on " + arrivalDateTime.getDayOfMonth() + "/" + arrivalDateTime.getMonthValue() + "/" + arrivalDateTime.getYear() + " at "
                    + arrivalDateTime.getHour() + ":"
                    + arrivalDateTime.getMinute());
        }
    }
}
