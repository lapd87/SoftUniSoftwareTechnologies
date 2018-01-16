/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:52 ч.
 */

import java.util.Scanner;

public class _13ReverseString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        StringBuilder input = new StringBuilder(console.nextLine());

        System.out.println(input.reverse());
    }
}