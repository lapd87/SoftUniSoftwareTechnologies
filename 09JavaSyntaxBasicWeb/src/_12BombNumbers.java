/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:52 ч.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _12BombNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<Integer> input = Stream.of(console.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bomb = Arrays
                .stream(console.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int bombIndex = input.indexOf(bomb[0]);

        while (bombIndex > -1)
        {
            int bombRange = 2 * bomb[1] + 1;

            int startIndex = bombIndex - bomb[1];

            while (startIndex < 0)
            {
                startIndex++;
                bombRange--;
            }

            while (startIndex + bombRange > input.size())
            {
                bombRange--;
            }

            input.subList(startIndex,bombRange+startIndex).clear();

            bombIndex = input.indexOf(bomb[0]);
        }

        int sum = 0;

        for (Integer item : input)
        {
            sum += item;
        }

        System.out.println(sum);
    }
}