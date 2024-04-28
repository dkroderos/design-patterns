public class ECommerce {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        Furniture sofa = new Sofa();
        Furniture table = new Table();

        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();

        chair.accept(shippingCostCalculator);
        sofa.accept(shippingCostCalculator);
        table.accept(shippingCostCalculator);

        double totalShippingCost = shippingCostCalculator.getTotalShippingCost();
        System.out.println("Total Shipping Cost: $" + totalShippingCost);
    }
}