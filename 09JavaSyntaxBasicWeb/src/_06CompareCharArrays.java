/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:47 ч.
 */

import java.util.Scanner;

public class _06CompareCharArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstLine = String.join("", console.nextLine().split("\\s+"));
        String secondLine = String.join("", console.nextLine().split("\\s+"));

        if (firstLine.compareTo(secondLine) <= 0) {
            System.out.println(firstLine);
            System.out.println(secondLine);
        } else {
            System.out.println(secondLine);
            System.out.println(firstLine);
        }
    }
}