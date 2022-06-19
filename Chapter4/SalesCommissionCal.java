package Chapter4;

import java.util.Scanner;

public class SalesCommissionCal {
    public static void main(String[] args) {

        String prompt = """
                Items:
                Item Name               Value($)
                1. Cassava              239.99
                2. Cocoa                129.75
                3. Castor                99.95
                4. Sunflower            350.89
                
                """;
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);

        double cassavaPrice = 239.99;
        double cocoa = 129.75;
        double castor = 99.95;
        double sunflower = 350.89;

        int commission = 9/100;
        int totalQuantity;
        int quantity = 0;
        int pricePerUnit = 0;
        int itemPrice = 0;
        int rate;
        double commissionForCassava = commission * quantity;
        double commissionForCocoa = commission * quantity;
        double commissionForCastor = commission * quantity;
        double commissionForSunflower = commission * quantity;

        int exit = 0;
        while (exit != -1) {
            rate = commission * itemPrice +1;
            totalQuantity = quantity * pricePerUnit;
            System.out.println("Enter item price");
            itemPrice = userInput.nextInt();

            System.out.println("Enter quantity of items");
            quantity = userInput.nextInt();

            System.out.printf("Your commission for this week is: %.2f%n", totalQuantity);

        }
    }
}
