package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();

        notification = new EmailNotification(notification);
        notification = new SMSNotification(notification);
        notification = new PushNotification(notification);

        notification.send("Hello, World!");

        // Adding only SMS and Email notifications
        Notification notification2 = new BasicNotification();
        notification2 = new EmailNotification(notification2);
        notification2 = new SMSNotification(notification2);
        notification2.send("Hello, Universe!");
    }
}
