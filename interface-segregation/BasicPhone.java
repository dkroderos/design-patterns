public class BasicPhone implements Communicable, Textable {
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Sending to " + number + ": " + message);
    }
}