/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:53 ч.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _20CountWorkingDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstLine = console.nextLine();
        String secondLine = console.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate firstDate = LocalDate.parse(firstLine, formatter);
        LocalDate secondDate = LocalDate.parse(secondLine, formatter);

        int workingDays = 0;

        while (!firstDate.equals(secondDate.plusDays(1))) {
            boolean holiday = checkIfHoliday(firstDate);

            if (!holiday) {
                workingDays++;
            }

            firstDate = firstDate.plusDays(1);
        }

        System.out.println(workingDays);
    }

    private static boolean checkIfHoliday(LocalDate date) {
        if ((date.getDayOfMonth() == 1 && date.getMonth().getValue() == 1) ||
                (date.getDayOfMonth() == 3 && date.getMonth().getValue() == 3) ||
                (date.getDayOfMonth() == 1 && date.getMonth().getValue() == 5) ||
                (date.getDayOfMonth() == 6 && date.getMonth().getValue() == 5) ||
                (date.getDayOfMonth() == 24 && date.getMonth().getValue() == 5) ||
                (date.getDayOfMonth() == 6 && date.getMonth().getValue() == 9) ||
                (date.getDayOfMonth() == 22 && date.getMonth().getValue() == 9) ||
                (date.getDayOfMonth() == 1 && date.getMonth().getValue() == 11) ||
                (date.getDayOfMonth() == 24 && date.getMonth().getValue() == 12) ||
                (date.getDayOfMonth() == 25 && date.getMonth().getValue() == 12) ||
                (date.getDayOfMonth() == 26 && date.getMonth().getValue() == 12) ||
                (date.getDayOfWeek().getValue() == 6) ||
                (date.getDayOfWeek().getValue() == 7)) {
            return true;
        } else {
            return false;
        }
    }
}