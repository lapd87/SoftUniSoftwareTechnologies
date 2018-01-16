/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:43 ч.
 */

import java.util.Arrays;
import java.util.Scanner;

public class __006Largest3Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(input);

        for (int i = input.length - 1; i >= 0 && i > input.length - 4; i--) {
            System.out.println(input[i]);
        }
    }
}