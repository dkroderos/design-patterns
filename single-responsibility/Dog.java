public class Dog extends Pet implements Noisy, Feedable {
    public Dog(String petName, String petOwner) {
        super(petName, petOwner);
    }

    @Override
    public String makeSound() {
        return "A dog named " + super.getPetName() + " is annoying " + super.getPetOwner() + " by making noise";
    }

    @Override
    public String eat() {
        return super.getPetOwner() + " is feeding " + super.getPetName();
    }
}