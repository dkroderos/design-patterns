public class Pet implements Noisy, Feedable {
    private String petName;
    private String petOwner;

    public Pet(String petName, String petOwner) {
        this.petName = petName;
        this.petOwner = petOwner;
    }

    public String getPetName() {
        return this.petName;
    }
    
    public String getPetOwner() {
        return this.petOwner;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
 
    public void setPetOwnwer(String petOwner) {
        this.petOwner = petOwner;
    }

    public String makeSound() {
        return petName + " is annoying " + petOwner + " by making noise";
    }

    public String eat() {
        return petOwner + " is feeding " + petName;
    }
}