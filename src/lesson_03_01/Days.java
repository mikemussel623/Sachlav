package lesson_03_01;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What day is today?");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        scanner.close();

    }
}
