/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:45 ч.
 */

import java.util.Scanner;

public class _02BooleanVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        if (input.equals("True")){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}