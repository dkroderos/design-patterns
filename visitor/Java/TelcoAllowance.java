import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private static Map<String, Integer> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(TelcoSubscription telcoSubscription) {
        String telcoName = telcoSubscription.getTelcoName();
        int allowance = allowanceMap.get(telcoSubscription.getTelcoName());
        int promoPrice = telcoSubscription.getPromoPrice();

        return telcoName + "\n" +
                allowance + " GB for "
                + promoPrice + " monthly";
    }
}