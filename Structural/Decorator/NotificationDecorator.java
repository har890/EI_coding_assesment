package Structural.Decorator;

public abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification notification) {
        this.decoratedNotification = notification;
    }

    @Override
    public void send(String message) {
        decoratedNotification.send(message);
    }
}
