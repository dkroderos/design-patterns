import java.util.ArrayList;

class NewsAgency implements NewsPublisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Publishing breaking news: " + news);
        notifySubscribers(news);
    }
}