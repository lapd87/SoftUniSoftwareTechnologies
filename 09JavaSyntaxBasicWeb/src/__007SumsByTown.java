/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:44 ч.
 */

import java.util.*;

public class __007SumsByTown {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        Map<String,Double> townIncome = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split("\\s+\\|\\s+");

            String currentTown = input[0];
            double currentIncome = Double.parseDouble(input[1]);

            if (!townIncome.containsKey(currentTown)){
                townIncome.put(currentTown,0.0);
            }

            townIncome.put(currentTown, townIncome.get(currentTown)+currentIncome);
        }

        for (Map.Entry<String, Double> entry : townIncome.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}