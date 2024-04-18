public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(double price);
}