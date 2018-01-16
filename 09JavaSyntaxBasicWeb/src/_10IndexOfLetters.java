/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:51 ч.
 */

import java.util.Scanner;

public class _10IndexOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] input = console.nextLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " -> " + (Character.getNumericValue(input[i]) - 10));
        }
    }
}