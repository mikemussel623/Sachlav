package homework02;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 0 - 100: ");

        int x = input.nextInt();

        if (x < 0 || x > 100) {
            System.out.println("Wrong number, fella.");
        } else if (x >= 0 && x <= 14) {
            System.out.println("[0 - 14]");
        } else if (x >= 15 && x <= 35) {
            System.out.println("[15 - 35]");
        } else if (x >= 35 && x <=50) {
            System.out.println("[35 -50]");
        } else if (x >= 51 && x <= 100) {
            System.out.println("[51 - 100]");
        }

        input.close();

    }
}
