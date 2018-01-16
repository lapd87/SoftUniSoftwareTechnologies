/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:41 ч.
 */

import java.util.Scanner;

public class _01VariableInHexFormat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputHex = console.nextLine();

        System.out.println(Integer.parseInt(inputHex, 16));
    }
}