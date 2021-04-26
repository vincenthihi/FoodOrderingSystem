import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        String userInput;
        boolean startOrder = false;
        boolean isOrderOver = false;
        Scanner scnr = new Scanner(System.in);

        //Welcome Screen
        System.out.println("Welcome to GroupH Food District");
        System.out.println("Would you like to begin ordering? 1=yes 0=no");


        while (!startOrder) {
            userInput = scnr.nextLine();

                switch (userInput) {
                    case "1":
                        startOrder = true;
                        break;

                    case "0":
                        startOrder = true;
                        System.out.println("See you next time!");
                        isOrderOver = true;

                        break;

                    default:
                        System.out.println("Your input was not 1 or 2, please try again!");
                        break;
                }
            }
        if(!isOrderOver) {

        Menu.printMenu();

        }

        scnr.close();

    }
}
