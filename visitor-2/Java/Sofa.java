public class Sofa implements Furniture {
    @Override
    public void accept(FurnitureVisitor furnitureVisitor) {
        furnitureVisitor.visit(this);
    }
}
