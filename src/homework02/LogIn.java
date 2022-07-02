package homework02;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName = "Admin";
        String userPass = "qwerty123";


        int tries = 0;

        do {
            System.out.println("Enter Username: ");
            String userLogIn = input.nextLine();
            System.out.println("Enter Password: ");
            String userPassword = input.nextLine();

            if (userLogIn.equals(userName) && userPassword.equals(userPass)) {
                System.out.println("NICE!");
                break;

            } else {
                System.out.println("WRONG!");
                tries++;
                System.out.println("Current tries: " + tries);

            }

        }
        while (tries <= 4);

        }
        input.close();

    }

