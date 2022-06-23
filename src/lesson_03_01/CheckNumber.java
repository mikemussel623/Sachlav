package lesson_03_01;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {


        // создание сканнера
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");

        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number " + a + " is Even");
        }
        else {
            System.out.println(" is Uneven");
        }




    }
}
