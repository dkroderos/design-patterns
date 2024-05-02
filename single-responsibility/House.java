public class House {
    public static void main(String[] args) {
        var cat = new Cat("Catty", "Neo");
        var dog = new Dog("Browny", "David");

        System.out.println(cat.makeSound());
        System.out.println(cat.eat());

        System.out.println(dog.makeSound());
        System.out.println(dog.eat());
    }
}