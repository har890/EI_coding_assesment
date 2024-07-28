package Structural.Decorator;

public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Basic Notification: " + message);
    }
}
