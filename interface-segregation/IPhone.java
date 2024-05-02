public class IPhone implements Communicable, Browsable, Camera {
    public void makeCall(String number) {
        System.out.println("Calling " + number + " via iPhone");
    }

    public void sendSMS(String number, String message) {
        System.out.println("Sending to " + number + ": " + message + " via iPhone");
    }

    public void browseWeb(String url) {
        System.out.println("Browsing " + url + " via iPhone");
    }

    public void takePicture() {
        System.out.println("Taking picture via Samsung");
    }
}