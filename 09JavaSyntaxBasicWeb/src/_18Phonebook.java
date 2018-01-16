/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:53 ч.
 */

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class _18Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split("\\s+");

        HashMap<String, String> phonebook = new HashMap<>();

        while (!input[0].equals("END")) {
            if (input[0].equals("A")) {
                phonebook.put(input[1], input[2]);
            } else {
                if (phonebook.containsKey(input[1])) {
                    System.out.println(input[1] + " -> " + phonebook.get(input[1]));
                } else {
                    System.out.printf("Contact %s does not exist.%n", input[1]);
                }
            }

            input = console.nextLine().split("\\s+");
        }
    }
}