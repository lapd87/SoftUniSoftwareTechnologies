/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:54 ч.
 */

import java.util.Arrays;
import java.util.Scanner;

public class _22IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] firstCircleParam = Arrays
                .stream(console.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondCircleParam = Arrays
                .stream(console.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Circle firstCircle = new Circle(firstCircleParam[0],
                firstCircleParam[1],
                firstCircleParam[2]);

        Circle secondCircle = new Circle(secondCircleParam[0],
                secondCircleParam[1],
                secondCircleParam[2]);


        double differenceX = firstCircle.X - secondCircle.X;

        double differenceY = firstCircle.Y - secondCircle.Y;

        double distance = Math.sqrt(differenceX * differenceX + differenceY * differenceY);

        if (distance > firstCircle.radius + secondCircle.radius) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static class Circle {
        private int X;
        private int Y;
        private int radius;

        public int getX() {
            return X;
        }

        public void setX(int x) {
            X = x;
        }

        public int getY() {
            return Y;
        }

        public void setY(int y) {
            Y = y;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public Circle(int x, int y, int radius) {

            X = x;
            Y = y;
            this.radius = radius;
        }
    }
}