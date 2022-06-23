package homework_01;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

       String login = "Admin";
       String pass = "P@ssword";
      //  String loginCheck; String passCheck;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you Login: ");

        login = input.nextLine();
        if (login.equals("Admin")) {
        System.out.println("Enter you password: ");

        }
            else {
           System.out.println("Incorrect username, there's no user with that name");

        }

        pass = input.nextLine();
        if (pass.equals("P@ssword")) {
            //System.out.println("Incorrect password");
            System.out.println("Hello, " + login + " you've logged in");
        }
        else {
            System.out.println("Password is incorrect");
        }

        input.close();



    }
}
