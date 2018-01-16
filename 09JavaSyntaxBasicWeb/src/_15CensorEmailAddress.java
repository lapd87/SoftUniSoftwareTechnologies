/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:52 ч.
 */

import java.util.Collections;
import java.util.Scanner;

public class _15CensorEmailAddress {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String email = console.nextLine();
        String text = console.nextLine();

        String[] emailArr = email.split("@");
        String newName = String
                .join("", Collections
                        .nCopies(emailArr[0].length(), "*"));

        String replacement = newName + "@" + emailArr[1];

        System.out.println(text.replaceAll(email.toString(), replacement));
    }
}