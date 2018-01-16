/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:50 ч.
 */

import java.util.Scanner;

public class __002SumTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstNum = Double.parseDouble(console.nextLine());
        double secondNum = Double.parseDouble(console.nextLine());

        System.out.printf("%.2f",firstNum+secondNum);
    }
}