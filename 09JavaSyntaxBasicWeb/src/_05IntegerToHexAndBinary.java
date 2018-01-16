/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:47 ч.
 */

import java.util.Scanner;

public class _05IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());

        System.out.println(Integer.toHexString(input).toUpperCase());
        System.out.println(Integer.toBinaryString(input));

    }
}