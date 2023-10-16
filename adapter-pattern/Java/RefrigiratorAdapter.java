public class RefrigiratorAdapter implements PowerOutlet {
    private Refrigirator refrigirator;

    public RefrigiratorAdapter(Refrigirator refrigirator) {
        this.refrigirator = refrigirator;
    }

    public String plugin() {
        return this.refrigirator.startCooling();
    }
}
