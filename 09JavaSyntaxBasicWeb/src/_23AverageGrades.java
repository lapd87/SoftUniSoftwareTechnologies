/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:54 ч.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _23AverageGrades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split(" ");

            String currentName = input[0];
            List<Double> currentGrades = new ArrayList<>();

            for (int j = 1; j < input.length; j++) {
                currentGrades.add(Double.parseDouble(input[j]));
            }

            Student currentStudent = new Student(currentName, currentGrades);

            if (currentStudent.Average() >= 5) {
                students.add(currentStudent);
            }
        }

        Comparator<Student> studentComparator = (first, second) ->
                first.Name.compareTo(second.Name);

        studentComparator = studentComparator.thenComparing((first, second) ->
                second.Average().compareTo(first.Average()));

        students.sort(studentComparator);

        for (Student st : students) {
            System.out.println(st.Name + " -> " +
                    String.format("%.2f",st.Average()));
        }
    }

    private static class Student {
        private String Name;
        private List<Double> Grade;

        private Double Average() {
            return Grade.stream()
                    .mapToDouble(Double::doubleValue)
                    .sum() / Grade.size();
        }

        ;

        public Double gerAverage() {
            return Average();
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public List<Double> getGrade() {
            return Grade;
        }

        public void setGrade(List<Double> grade) {
            Grade = grade;
        }

        public Student(String name, List<Double> grade) {
            Name = name;
            Grade = grade;
        }
    }
}