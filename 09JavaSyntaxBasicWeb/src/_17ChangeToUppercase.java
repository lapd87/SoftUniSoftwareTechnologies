/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:53 ч.
 */

import java.util.Scanner;

public class _17ChangeToUppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        while (input.contains("<upcase>")) {
            String[] splitInput = input
                    .split("<upcase>|</upcase>", 3);

            input = splitInput[0] +
                    splitInput[1].toUpperCase() +
                    splitInput[2];
        }

        System.out.println(input);
    }
}