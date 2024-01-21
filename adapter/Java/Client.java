import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop();
        Refrigirator refrigirator = new Refrigirator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        RefrigiratorAdapter refrigiratorAdapter = new RefrigiratorAdapter(refrigirator);
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        System.out.println("Adapter Pattern!\n");

        boolean hasExit = false;
        while (!hasExit) {
            System.out.println("What you want to do?:\n");
            System.out.println("1: Charge Laptop.");
            System.out.println("2: Start Cooling Refrigirator.");
            System.out.println("3: Charge Smartphone.");
            System.out.println("4: Exit.\n");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            System.out.println();

            switch (choice) {
                case 1: 
                    System.out.println(laptopAdapter.plugin() + "\n");
                    break;
                case 2: 
                    System.out.println(refrigiratorAdapter.plugin() + "\n");
                    break;
                case 3: 
                    System.out.println(smartphoneAdapter.plugin() + "\n");
                    break;
                case 4: 
                    hasExit = true;
                    break;
                default: 
                    System.out.println("Invalid choice... Try again!");
                    break;
            }
        }

        System.out.println("Exiting...");

        scanner.close();
    }
}
