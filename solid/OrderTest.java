public class OrderTest {
    public static void main(String[] args) {
        BasicOrder basicOrder = new BasicOrder();
        basicOrder.calculateTotal(10.0, 2);
        basicOrder.placeOrder("John Doe", "123 Main St");

        PremiumOrder premiumOrder = new PremiumOrder();
        premiumOrder.calculateTotal(10.0, 2);
        premiumOrder.placeOrder("John Doe", "123 Main St");
        premiumOrder.generateInvoice("order_123.pdf");
        premiumOrder.sendEmailNotification("johndoe@example.com");
    }
}
