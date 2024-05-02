public class Cat extends Pet implements Noisy, Feedable {
    public Cat(String petName, String petOwner) {
        super(petName, petOwner);
    }

    @Override
    public String makeSound() {
        return "A cat named " + super.getPetName() + " is annoying " + super.getPetOwner() + " by making noise";
    }

    @Override
    public String eat() {
        return super.getPetOwner() + " is feeding " + super.getPetName();
    }
}