public class Cat extends Pet implements Noisy, Feedable {
    public Cat(String petName, String petOwner) {
        super(petName, petOwner);
    }

    public String makeSound() {
        return super.getPetName() + " is annoying " + super.getPetOwner() + " by making noise";
    }

    public String eat() {
        return super.getPetOwner() + " is feeding " + super.getPetName();
    }
}