public class Client implements Subscriber {
    private String subscriberName;

    public Client(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(subscriberName + " received breaking news: " + news);
    } 
}