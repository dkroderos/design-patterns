public interface FurnitureVisitor {
    void visit(Chair chair);

    void visit(Sofa sofa);

    void visit(Table table);
}
