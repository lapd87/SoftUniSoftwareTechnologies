/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:46 ч.
 */

import java.util.Scanner;

public class _03ReverseCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append(console.nextLine());
        }

        System.out.println(result.reverse().toString());
    }
}