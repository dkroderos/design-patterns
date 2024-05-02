public class Pet {
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
}