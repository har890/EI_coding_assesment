package Behavioural.Observer;

public class NewsSubscriber implements Observer {
    private String name;

    public NewsSubscriber(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Subscriber name cannot be null or empty");
        }
        this.name = name;
    }

    @Override
    public void update(String news) {
        if (news == null || news.isEmpty()) {
            System.out.println(name + " received invalid news update.");
        } else {
            System.out.println(name + " received news: " + news);
        }
    }

    @Override
    public String toString() {
        return "NewsSubscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}

