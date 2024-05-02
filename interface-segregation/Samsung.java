public class Samsung implements Communicable, Browsable, Camera {
    public void makeCall(String number) {
        System.out.println("Calling " + number + " via Samsung");
    }

    public void sendSMS(String number, String message) {
        System.out.println("Sending to " + number + ": " + message + " via Samsung");
    }
    
    public void browseWeb(String url) {
        System.out.println("Browsing " + url + " via Samsung");
    }

    public void takePicture() {
        System.out.println("Taking picture via Samsung");
    }
}