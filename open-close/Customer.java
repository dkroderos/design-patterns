public class Customer implements Discountable {
  private String name;
  private String type; // "Student", "Senior Citizen", or "Regular"

  public Customer(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }
  
  public double calculateDiscount(double amount) {
    if (type.equalsIgnoreCase("Student")) {
      return amount * 0.05;
    } else if (type.equalsIgnoreCase("Senior Citizen")) {
      return amount * 0.10;
    } else {
      return 0.0; // No discount for Regular
    }
  }

  public double applyDiscount(double amount) {
    return amount - calculateDiscount(amount);
  }
}