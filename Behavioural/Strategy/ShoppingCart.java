package Behavioural.Strategy;

// ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(int price) {
        items.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        int total = items.stream().mapToInt(Integer::intValue).sum();
        paymentStrategy.pay(total);
    }
}
