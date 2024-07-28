package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NewsAgency implements Subject {
    private static final Logger logger = Logger.getLogger(NewsAgency.class.getName());
    private List<Observer> observers;
    private String latestNews;

    public NewsAgency() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
            logger.info("Observer registered: " + observer.toString());
        } else {
            logger.warning("Failed to register observer: " + (observer == null ? "null" : observer.toString()));
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        if (observer != null && observers.contains(observer)) {
            observers.remove(observer);
            logger.info("Observer unregistered: " + observer.toString());
        } else {
            logger.warning("Failed to unregister observer: " + (observer == null ? "null" : observer.toString()));
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            try {
                observer.update(latestNews);
            } catch (Exception e) {
                logger.severe("Error notifying observer: " + observer.toString() + " - " + e.getMessage());
            }
        }
    }

    public void setLatestNews(String news) {
        if (news == null || news.isEmpty()) {
            logger.warning("Invalid news update provided");
            return;
        }
        this.latestNews = news;
        notifyObservers();
        logger.info("News updated: " + news);
    }
}

