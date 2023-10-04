package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean hasExit = false;
        while (!hasExit) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet = null;
            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    hasExit = true;
                    break;
                default:
                    continue;
            }
            if (pet != null) {
                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());

                if (pet instanceof Dog)
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                else if (pet instanceof Cat)
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                System.out.println();
            }
        }
        System.out.println("Exiting...");

        input.close();
    }
}
