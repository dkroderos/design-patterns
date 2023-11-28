public class News {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber teacher1 = new Client("Teacher 1");
        Subscriber teacher2 = new Client("Teacher 2");

        newsAgency.subscribe(teacher1);
        newsAgency.subscribe(teacher2);

        newsAgency.publishNews("ChatGPT is used by students for cheating!");

        newsAgency.unsubscribe(teacher2);

        newsAgency.publishNews("Anti-AI detection system has been invented!");
    }
}