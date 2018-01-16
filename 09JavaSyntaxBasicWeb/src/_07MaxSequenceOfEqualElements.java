/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:50 ч.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int maxCount = 1;
        int index = 0;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                index = i + 1;
            }
        }

        for (int i = index; i > index - maxCount; i--) {
            System.out.printf((input[i] + " "));
        }
    }
}