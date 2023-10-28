public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public String requestCart(int numberOfCarts) {
        return numberOfCarts + " cart(s) has been requested for luggage!";
    }

    public String provideService() {
        return requestCart(numberOfCarts);
    }
}
