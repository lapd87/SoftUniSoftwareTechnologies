/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:47 ч.
 */

import java.util.Scanner;

public class _04VowelOrDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char input = console.next().charAt(0);

        if (input >= 48 && input <= 57) {
            System.out.println("digit");
        } else if (input == 'a' ||
                input == 'e' ||
                input == 'i' ||
                input == 'o' ||
                input == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}