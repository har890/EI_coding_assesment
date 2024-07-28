package Behavioural.Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsSubscriber subscriber1 = new NewsSubscriber("Alice");
        NewsSubscriber subscriber2 = new NewsSubscriber("Bob");

        newsAgency.registerObserver(subscriber1);
        newsAgency.registerObserver(subscriber2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter news updates (type 'exit' to quit):");

        while (true) {
            String news = scanner.nextLine();
            if ("exit".equalsIgnoreCase(news)) {
                break;
            }
            newsAgency.setLatestNews(news);
        }

        scanner.close();
    }
}

