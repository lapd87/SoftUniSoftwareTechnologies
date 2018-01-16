/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:43 ч.
 */

import java.util.Arrays;
import java.util.Scanner;

public class __003ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(input);
        int firstNum = input[0];
        int secondNum = input[1];
        int thirdNum = input[2];


        if (thirdNum == firstNum + secondNum) {
            System.out.printf("%d + %d = %d", firstNum, secondNum, thirdNum);
        } else if (firstNum == secondNum + thirdNum) {
            System.out.printf("%d + %d = %d", secondNum, thirdNum, firstNum);
        } else if (secondNum == firstNum + thirdNum) {
            System.out.printf("%d + %d = %d", firstNum, thirdNum, secondNum);
        } else {
            System.out.println("No");
        }
    }
}
