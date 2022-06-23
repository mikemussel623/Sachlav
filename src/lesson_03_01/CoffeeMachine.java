package lesson_03_01;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Money: ");

        int budget = input.nextInt();
        int drinkCost = 0;

        if (budget > 0) {
            System.out.println("Choose your drink!");
            System.out.println("1 - Espresso (40p)");
            System.out.println("2 - Cappuccino (80p)");
            System.out.println("3 - Americano (60p)");
            System.out.println("4 - Tea (10p)");

            //System.out.println("Your budget is " + budget);
            int userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    drinkCost += 40;
                    //System.out.println("");
                    break;
                case 2:
                    drinkCost +=80;
                    //System.out.println("");
                    break;
                case 3:
                    drinkCost += 60;
                    //System.out.println("");
                    break;
                case 4:
                    drinkCost +=10;
                    System.out.println("");
                    break;
                default:
                    System.out.println("Oops..");
                    break;
            }

            if (budget >= drinkCost) {
                System.out.println("Drink number " + userChoice + " was chosen");
                System.out.println("Take your drink, Have a nice day!");
                System.out.println("Your change is " + (budget - drinkCost));

                // In case we continue with purchase
                budget -= drinkCost;
            }
            else {
                System.out.println("Your budget " + budget + " is not enough to buy drink with a cost " + drinkCost);
            }

        }

        else if (budget == 0) {
            System.out.println("Your budget is 0");
        }

        else {
            System.out.println("You have no budget at all. Go to work!");
        }

        input.close();

    }
}
