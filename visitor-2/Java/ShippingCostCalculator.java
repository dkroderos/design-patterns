public class ShippingCostCalculator implements FurnitureVisitor {
    private double totalShippingCost = 0;

    @Override
    public void visit(Chair chair) {
        totalShippingCost += 10;
    }

    @Override
    public void visit(Sofa sofa) {
        totalShippingCost += 20;
    }

    @Override
    public void visit(Table table) {
        totalShippingCost += 15;
    }

    public double getTotalShippingCost() {
        return this.totalShippingCost;
    }
}
