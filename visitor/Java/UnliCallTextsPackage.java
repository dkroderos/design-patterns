public class UnliCallTextsPackage implements UnliCallTextsOffer {
    @Override
    public String showUnliCallsTextOffer(TelcoSubscription telcoSubscription) {
        boolean hasUnli = telcoSubscription.getUnliCallText();

        return telcoSubscription.getTelcoName() + "\n" +
                (hasUnli ? "Has unlimited calls and texts"
                        : "No unlimited calls and texts");
    }
}