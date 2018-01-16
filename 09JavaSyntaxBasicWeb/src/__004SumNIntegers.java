/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:43 ч.
 */

import java.util.Scanner;

public class __004SumNIntegers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(console.nextLine());
        }

        System.out.println("Sum = " + sum);
    }
}