package Behavioural.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardName;

    public CreditCardPayment(String cardNumber, String cardName) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card " + cardNumber + " by " + cardName);
    }
}
