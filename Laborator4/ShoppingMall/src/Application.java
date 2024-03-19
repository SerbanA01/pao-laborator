import carduri.*;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the cards owner: ");
        String owner = scanner.nextLine();
        System.out.println("Enter the limit of the card: ");
        double limit = scanner.nextDouble();
        scanner.nextLine();
        DebitCard cardDebit = new DebitCard(owner, limit);
        CreditCard cardCredit = new CreditCard(owner);

        ShoppingMall mall = new ShoppingMall();
        while(true) {
            System.out.println("What card do you want to use? (debit/credit)");
            String cardType = scanner.nextLine();

            if(cardType.equals("debit")) {
                mall.setCard(cardDebit);
            } else if(cardType.equals("credit")) {
                mall.setCard(cardCredit);
            }
            System.out.println("Enter the amount of the transaction: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            mall.achizitie(amount);
            System.out.println("Do you want to make another transaction? (yes/no)");
            String answer = scanner.nextLine();
            if(answer.equals("no")) {
                break;
            }
        }

    }
}