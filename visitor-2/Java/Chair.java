public class Chair implements Furniture {
    @Override
    public void accept(FurnitureVisitor furnitureVisitor) {
        furnitureVisitor.visit(this);
    }
}
