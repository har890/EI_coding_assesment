package Behavioural.Strategy;

// Main.java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(200);

        // Paying with credit card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout();

        // Paying with PayPal
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout();

        // Paying with Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout();
    }
}
