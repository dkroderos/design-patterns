public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallOffer offer, boolean unliCallText);
}