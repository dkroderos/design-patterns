# Visitor Pattern
Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.

Smart: Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.
Globe: Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.
Ditto: Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all networks within the country.
Implement the visitor design pattern based from the given diagram. Refer to this link.  

```java
public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextsOffer unli = new UnliCallTextsPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
    }
}
```

# UML Diagram
![image](https://github.com/dkroderos/design-patterns/assets/75028710/440ae229-8768-4318-89c3-5a95cde3dd74)
