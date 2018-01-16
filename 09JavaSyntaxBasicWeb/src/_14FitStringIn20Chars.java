/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:52 ч.
 */

import java.util.Scanner;

public class _14FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String result = input;

        if (input.length() <= 20) {
            for (int i = 0; i < 20 - input.length(); i++) {
                result += "*";
            }
        } else {
            result = result.substring(0,20);
        }

        System.out.println(result);
    }
}