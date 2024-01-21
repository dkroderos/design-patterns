import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl remoteControl = new RemoteControl(new LightCommand(light),
                new GetLightStatusCommand(light), new IncreaseTempCommand(thermostat),
                new DecreaseTempCommand(thermostat), new GetTempCommand(thermostat), new VolumeUpCommand(musicPlayer),
                new VolumeDownCommand(musicPlayer), new GetVolumeCommand(musicPlayer));

        System.out.println("Smart Home!");

        boolean hasExit = false;
        while (!hasExit) {
            System.out.println("Choose what to do on the remote:\n");
            System.out.println("1: Click Light Button.");
            System.out.println("2: Click Increase Thermostat Temperature Button.");
            System.out.println("3: Click Decrease Thermostat Temperature Button.");
            System.out.println("4: Click Increase Music Player Volume Button.");
            System.out.println("5: Click Decrease Music Player Volume Button.");
            System.out.println("6: Click Diagnostics Button");
            System.out.println("7: Exit\n");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    remoteControl.clickLightButton();
                    break;
                case 2:
                    remoteControl.clickIncreaseTempButton();
                    break;
                case 3:
                    remoteControl.clickDecreaseTempButton();
                    break;
                case 4:
                    remoteControl.clickVolumeUpButton();
                    break;
                case 5:
                    remoteControl.clickVolumeDownButton();
                    break;
                case 6:
                    remoteControl.clickDiagnosticsButton();
                    break;
                case 7:
                    hasExit = true;
                    System.out.print("Exiting...");
                    break;
                default: 
                    System.out.println("Invalid Choice!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}