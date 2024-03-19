import interfata.BankCard;

public class ShoppingMall {
    private BankCard BankCard;

    public ShoppingMall() {
    }
    public ShoppingMall(BankCard card) {
        this.BankCard = card;
    }

    public void setCard(BankCard card) {
        this.BankCard = card;
    }

    public void achizitie(double amount) {
        BankCard.doTransaction(amount);
    }
}