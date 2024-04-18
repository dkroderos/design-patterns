public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    private boolean unliCallText;

    public Telco(String telconame, double promoPrice, int dateAllowance, boolean unliCallText) {
        this.telcoName = telconame;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept() {

    }
}