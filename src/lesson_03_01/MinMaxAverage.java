package lesson_03_01;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double minimum;
        double maximum;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one");
        a = scanner.nextDouble();
        System.out.println("Enter number one");
        b = scanner.nextDouble();
        System.out.println("Enter number one");
        c = scanner.nextDouble();

        average = (a + b + c) / 3;
        System.out.println("average = " + average);

        // alt + J
        maximum = (a >= b) ? a : b;
        maximum = (maximum >= c) ? maximum : c;

        System.out.println("maximum = " + maximum);

        minimum = (a <= b) ? a : b;
        minimum = (minimum <= c) ? minimum : c;

        System.out.println("minimum = " + minimum);



    }
}
