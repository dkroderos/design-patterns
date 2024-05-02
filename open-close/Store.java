public class Store {
    public static void main(String[] args) {
        var david = new Customer("David", "Student");
        var neo = new Customer("Neo", "Regular");
        var izaya = new Customer("Izaya", "Senior Citizen");

        System.out.println(david.getName() + ", a " + david.getType() + ", is receiving a discount of " + david.applyDiscount(100));
        System.out.println(neo.getName() + ", a " + neo.getType() + ", is receiving a discount of " + neo.applyDiscount(100));
        System.out.println(izaya.getName() + ", a " + izaya.getType() + ", is receiving a discount of " + izaya.applyDiscount(100));
    }
}