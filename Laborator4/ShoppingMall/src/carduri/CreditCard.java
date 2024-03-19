package carduri;
import interfata.BankCard;

public class CreditCard implements BankCard {
    private static double spentAmount ;
    private static String utilizator;

    public CreditCard(String user) {
        this.spentAmount = 0;
        this.utilizator = user;
    }

    @Override
    public void doTransaction(double amount) {
        spentAmount += amount;
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
        System.out.println("Suma totala cheltuita cu carduri de credit este " + spentAmount);

    }
}