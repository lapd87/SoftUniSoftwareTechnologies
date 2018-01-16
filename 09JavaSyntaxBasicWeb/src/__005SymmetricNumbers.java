/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:43 ч.
 */

import java.util.Scanner;

public class __005SymmetricNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            String currentNum = Integer.toString(i);
            String reversedNum = new StringBuilder(currentNum).reverse().toString();

            if (currentNum.equals(reversedNum)) {
                System.out.print(i + " ");
            }
        }
    }
}